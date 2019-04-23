
package Pilas;
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    //Estructura Libro con los datos de tipo cadena: título, autor e isbn
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    //Retorna el Título
    public String getTitulo() {
        return titulo;
    }
    //Retorna el Autor
    public String getAutor() {
        return autor;
    }
    //Retorna el Isbn
    public String getIsbn() {
        return isbn;
    }
    //Establece el Título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //Establece el Autor
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Establece el ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
