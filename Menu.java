package GestionBiblioteca;

public class Menu {
	private Libro Libro;

    public Menu(Libro Libro) {
        this.Libro = Libro;
    }
	
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
            case 1:
                System.out.println("Has elegido la opción 1.");
                Libro.prestarLibro();
                break;
            case 2:
                System.out.println("Has elegido la opción 2.");
                Libro.devolverLibro();
                break;
            case 3:
                System.out.println("Has elegido la opción 3.");
                Libro.mostrarInformacion();
                break;
            case 4:
                System.out.println("Adiós.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        System.out.println();
    } while (opcion != 4);
}
               
	}
}
