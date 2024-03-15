package ejercicio3;

public class Libro {
    private String titulo,autor;
    private int pag;

    public Libro(String titulo, String autor, int pag) {
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

}
