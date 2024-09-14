//clase libro con sus atributos privados
public class Libro {
    private String titulo;
    private String autor;
    private long codigo;
    private boolean disponible;

//constructor, inicializa un nuevo objeto libro con sus atributos
public Libro(String titulo, String autor, long codigo){
    this.titulo = titulo;
    this.autor = autor;
    this.codigo = codigo;
    this.disponible = true;
 }

 //metodos getters y setters
  public String getTitulo(){ return titulo; }
  public void setTitulo(String titulo){ this.titulo = titulo; }

  public String getAutor(){ return autor; }
  public void setAutor(String autor){ this.autor = autor; }

  public long getCodigo(){ return codigo; }
  public void setCodigo(long codigo){ this.codigo = codigo; }

    //devueldo es estado de disponibilidad de libro
  public boolean estaDisponible(){ return disponible; }

//modifica internamente cuando el libro fue prestado y ya nno esta disponible
   public void prestar() {
      if (disponible) {
            disponible = false;
      }
   }

    //modifica el estado del libro a disponible cuando es devuelto
   public void devolver() {
        if (!disponible) {
            disponible = true;
        }
   }
}