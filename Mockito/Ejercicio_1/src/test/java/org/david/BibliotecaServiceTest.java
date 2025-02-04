package org.david;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BibliotecaServiceTest {

    @Mock
    private LibroRepository libroRepositoryMock; // Mock del repositorio

    @InjectMocks
    private BibliotecaService bibliotecaService; // Inyecta el mock

    // Test 1: Obtener detalles de un libro
    @Test
    public void testObtenerDetallesLibro() {
        // Configurar el mock
        Libro libroMock = new Libro("Libro1", "Autor1", 2025);
        when(libroRepositoryMock.buscarPorTitulo("Libro1")).thenReturn(libroMock);

        // Ejecutar el metodo bajo prueba
        Libro resultado = bibliotecaService.obtenerDetallesLibro("Libro1");

        // Verificaciones
        assertEquals(libroMock, resultado);
        verify(libroRepositoryMock, times(1)).buscarPorTitulo("Libro1");
    }

    // Test 2: Agregar un libro
    @Test
    public void testAgregarLibro() {
        Libro nuevoLibro = new Libro("Libro2", "Autor2", 2024);

        // Ejecutar el metodo bajo prueba
        bibliotecaService.agregarLibro(nuevoLibro);

        // Verificar que se llamó al repositorio
        verify(libroRepositoryMock, times(1)).guardar(nuevoLibro);
    }
}