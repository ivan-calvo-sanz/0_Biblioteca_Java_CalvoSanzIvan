package _10_POO_Ejemplos_de_Clases;

public class Libro {

    /* ATRIBUTOS */
    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    /* CONSTRUCTORES */
    public Libro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    /* METODOS GETTER Y SETTER */
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /* METODO toString */
    @Override
    public String toString() {
        return "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por el autor " + this.autor + " tiene " + this.numPaginas + " paginas.";
    }
}
