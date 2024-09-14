import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Clase Usuario que hereda de Persona
public class Usuario extends Persona{
    private List<Libro> librosPrestados;   //lista de libros prestados
    private static final int MAX_LIBROS_PRESTADOS = 3;  //constante para el numero maximo de prestamos
    private int contadorLibrosPrestados;

    public Usuario(String nombre, String apellido){  //constructor
        super(nombre, apellido);           //atributos heredados
        this.librosPrestados = new ArrayList<>();
        this.contadorLibrosPrestados = 0;
    }

    //metodo para prestar que verifica que el libro este disponible y que no se haya alcanzo el maximo de prestamos
    public boolean prestarLibro(Libro libro) {
        if (librosPrestados.size() < MAX_LIBROS_PRESTADOS && libro.estaDisponible()) {
            librosPrestados.add(libro);  //si ambas condiciones se cumplen, se agrega a la lista del usuario
            libro.prestar();
            contadorLibrosPrestados++;
            return true;
        }
        return false;
    }

    //metodo para devolver, si el libro esta en la lista lo elimina y cambia el estado a disponible mediante el metodo devolver
    public boolean devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.devolver();
            contadorLibrosPrestados--;
            return true;
        }
        return false;
    }

    //metodo que implementa el metodo abstracto y lo sobreescribe para mostrar los datos
    @Override
    public void mostrarDatos(){
        System.out.println("Identificación del Usuario: " + getNombre() + " " + getApellido());
    }

    //devuelve una lista inmutable de los libros prestados
    public List<Libro> getLibrosPrestados() {
        return Collections.unmodifiableList(librosPrestados);
    }

    //verifica que la lista de prestamos no este vacia, recorre la lista e imprime la informacion obtenida
    public void mostrarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println("No hay libros prestados.");
        } else {
            System.out.println("Libros en calidad de préstamo a: " + getNombre() + " " + getApellido() + "( " + getContadorLibrosPrestados() + " de 3 ).");
            for (Libro libro : librosPrestados) {
                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", codigo: " + libro.getCodigo());
            }
        }
    }
    public int getContadorLibrosPrestados() {
        return contadorLibrosPrestados;
    }
}

