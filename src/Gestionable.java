//interface para ser implementada en el prestamo y devolucion de los libros por las clases que lo requieran
public interface Gestionable {
    void prestarLibro(Usuario usuario, Libro libro);
    void devolverLibro(Usuario usuario, Libro libro);
}

