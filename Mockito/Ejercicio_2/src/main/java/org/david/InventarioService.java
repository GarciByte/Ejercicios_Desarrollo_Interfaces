package org.david;

public interface InventarioService {
    boolean verificarDisponibilidad(String productoId, int cantidad);
}