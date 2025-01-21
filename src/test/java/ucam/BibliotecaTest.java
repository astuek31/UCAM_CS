package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BibliotecaTest {
    @Test
    public void testAgregarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        biblioteca.agregarLibro(libro);

        List<Libro> libros = biblioteca.listarLibros();
        assertEquals(1, libros.size());
        assertEquals("Cien Años de Soledad", libros.get(0).getTitulo());
    }
}