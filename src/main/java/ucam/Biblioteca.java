package ucam;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> listarLibros() {
        return new ArrayList<>(libros)q; // Devuelve una copia de la lista
    }
}