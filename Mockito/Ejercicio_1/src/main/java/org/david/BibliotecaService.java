package org.david;

public class BibliotecaService {
    private LibroRepository libroRepository;

    public BibliotecaService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro obtenerDetallesLibro(String titulo) {
        return libroRepository.buscarPorTitulo(titulo);
    }

    public void agregarLibro(Libro libro) {
        libroRepository.guardar(libro);
    }
}