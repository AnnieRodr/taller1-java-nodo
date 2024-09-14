public class Bibliotecario extends Persona implements Gestionable { //clase que hereda de Persona e implementa los metodos de la Interfaz
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }
    //Implementacion de los metodos abstractos de la clase y de la interfaz
    @Override
    public void mostrarDatos() {
        System.out.println("Soy el bibliotecario: " + getNombre() + " " + getApellido());
    }
    @Override
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (usuario.prestarLibro(libro)) {
            System.out.println("Libro prestado con éxito");
        } else {
            System.out.println("No se pudo prestar el libro.");
        }
    }

    @Override
    public void devolverLibro(Usuario usuario, Libro libro) {
        if (usuario.devolverLibro(libro)) {
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("No se pudo devolver el libro.");
        }
    }
}