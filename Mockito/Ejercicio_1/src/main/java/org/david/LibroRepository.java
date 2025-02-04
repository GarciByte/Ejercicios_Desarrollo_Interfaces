package org.david;

public interface LibroRepository {
    Libro buscarPorTitulo(String titulo);

    void guardar(Libro libro);
}