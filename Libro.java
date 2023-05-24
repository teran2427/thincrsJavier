package GestionBiblioteca;

public class Libro {
	String titulo;
	String autor;
	int anioPublicacion;
	String isbn;
	boolean disponible = true;
	
	public Libro(String titulo, String autor, int anioPublicacion, String isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.disponible = disponible;
    }
	
	public void prestarLibro(){
		if (disponible) {
			disponible = false;
		}
	}
	
	public void devolverLibro() {
		disponible = true;
	}
	
	public void mostrarInformacion() {
		for (int i = 0; i < libros.length; i++) {
            System.out.println("Libro " + (i + 1) + ":");
            System.out.println("Título: " + libros[i].titulo);
            System.out.println("Autor: " + libros[i].autor);
            System.out.println("Año de publicación: " + libros[i].anioPublicacion);
            System.out.println("ISBN: " + libros[i].isbn);
            System.out.println("Disponible: " + libros[i].disponible);
            System.out.println();
        }
	}
	
}
