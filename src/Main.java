import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias del Usuario, Bibliotecario y Libro
        Bibliotecario bibliotecario = new Bibliotecario("Johan", "Quintero");
        Usuario usuario1 = new Usuario("Ana", "Roa");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 123456789);
        Libro libro2 = new Libro("Deja de Ser Tu", "Joe Dispenza", 77777);

        //Gestion de libros de la biblioteca
        System.out.println("Manejo de libros de nuestra biblioteca");
        //mostrar datos del bibliotecario
        bibliotecario.mostrarDatos();
       System.out.println("*************************************************************************************");


        // Préstamos de libros
        System.out.println("***PRESTAMOS***");
        usuario1.mostrarDatos();
        bibliotecario.prestarLibro(usuario1, libro1);
        bibliotecario.prestarLibro(usuario1, libro2);
        usuario1.mostrarLibrosPrestados();
        System.out.println("**************************************************************************************");

        //devoluciones de libros
        System.out.println("***DEVOLUCIONES***");
        bibliotecario.devolverLibro(usuario1, libro1);
        System.out.println("Se devolvió correctamente: " + libro1.getTitulo());
        System.out.println("***************************************************************************************");



        // Comparativa POO vs Funcional
        // Total de libros prestados usando Programación Orientada a Objetos
        long totalLibrosPrestadosPOO = usuario1.getContadorLibrosPrestados();
        System.out.println("Total de libros prestados (POO): " + totalLibrosPrestadosPOO);

        // Funcional
        long totalLibrosPrestadosFuncional = usuario1.getLibrosPrestados().stream().count();
        System.out.println("Total de libros prestados (Funcional): " + totalLibrosPrestadosFuncional);

        scanner.close();
    }
}

