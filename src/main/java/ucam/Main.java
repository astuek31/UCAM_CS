package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro2 = new Libro("1984", "George Orwell");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca.listarLibros()) {
            System.out.println(libro);
        }
    }
}