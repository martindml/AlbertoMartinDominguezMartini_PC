package demo;

public class Libro
{
    private String titulo;
    private String isbn;
    private String autor;
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo()
    {
        this.status = "prestado";
    }

    public void devolucion()
    {
        this.status = "libre";
    }

    @Override
    public String toString()
    {
        return this.getTitulo() + ",  " + this.getIsbn() + ", " + this.getAutor();
    }

    public Libro()
    {

    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.status = "Libre";
    }

}
