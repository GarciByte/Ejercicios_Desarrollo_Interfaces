package org.david;

public class PedidoService {
    private InventarioService inventarioService;
    private PagoService pagoService;

    public PedidoService(InventarioService inventarioService, PagoService pagoService) {
        this.inventarioService = inventarioService;
        this.pagoService = pagoService;
    }

    public boolean realizarPedido(String productoId, int cantidad) {
        // Verifica la disponibilidad del producto
        if (!inventarioService.verificarDisponibilidad(productoId, cantidad)) {
            throw new RuntimeException("Producto no disponible");
        }

        // Calcula el monto total
        double montoTotal = calcularMontoTotal(productoId, cantidad);

        // Procesa el pago
        if (!pagoService.procesarPago(montoTotal)) {
            throw new RuntimeException("Pago fallido");
        }

        return true; // Pedido exitoso
    }

    private double calcularMontoTotal(String productoId, int cantidad) {
        // Simula la obtención del precio del producto (en un caso real, esto vendría de
        // una base de datos)
        Producto producto = new Producto(productoId, "Producto Ejemplo", 100.0);
        return producto.getPrecio() * cantidad;
    }
}