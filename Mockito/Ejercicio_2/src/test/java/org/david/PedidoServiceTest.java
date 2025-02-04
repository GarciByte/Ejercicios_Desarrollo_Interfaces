package org.david;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PedidoServiceTest {

    @Mock
    private InventarioService inventarioServiceMock;

    @Mock
    private PagoService pagoServiceMock;

    @InjectMocks
    private PedidoService pedidoService;

    // Test 1: Pedido exitoso
    @Test
    public void testRealizarPedidoExitoso() {
        // Configurar mocks
        String productoId = "123";
        int cantidad = 2;
        double montoEsperado = 200.0;

        when(inventarioServiceMock.verificarDisponibilidad(productoId, cantidad)).thenReturn(true);
        when(pagoServiceMock.procesarPago(montoEsperado)).thenReturn(true);

        // Ejecutar el método
        boolean resultado = pedidoService.realizarPedido(productoId, cantidad);

        // Verificar
        assertTrue(resultado);
        verify(inventarioServiceMock).verificarDisponibilidad(productoId, cantidad);
        verify(pagoServiceMock).procesarPago(montoEsperado);
    }

    // Test 2: Producto no disponible
    @Test
    public void testRealizarPedido_ProductoNoDisponible() {
        String productoId = "456";
        int cantidad = 5;

        when(inventarioServiceMock.verificarDisponibilidad(productoId, cantidad)).thenReturn(false);

        // Verificar que lanza excepción
        assertThrows(RuntimeException.class, () -> {
            pedidoService.realizarPedido(productoId, cantidad);
        });

        verify(inventarioServiceMock).verificarDisponibilidad(productoId, cantidad);
        verifyNoInteractions(pagoServiceMock); // El pago no debe procesarse
    }

    // Test 3: Pago fallido
    @Test
    public void testRealizarPedido_PagoFallido() {
        String productoId = "789";
        int cantidad = 3;
        double montoEsperado = 300.0;

        when(inventarioServiceMock.verificarDisponibilidad(productoId, cantidad)).thenReturn(true);
        when(pagoServiceMock.procesarPago(montoEsperado)).thenReturn(false);

        // Verificar excepción
        assertThrows(RuntimeException.class, () -> {
            pedidoService.realizarPedido(productoId, cantidad);
        });

        verify(pagoServiceMock).procesarPago(montoEsperado);
    }
}