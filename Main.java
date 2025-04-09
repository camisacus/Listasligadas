import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProtesisDental lista = new ProtesisDental();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar componente");
            System.out.println("2. Mostrar prótesis dental (gráficamente)");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Tipo: ");
                    String tipo = scanner.next();
                    System.out.print("Dimensiones: ");
                    String dimensiones = scanner.next();
                    System.out.print("Material: ");
                    String material = scanner.next();
                    System.out.print("Posición: ");
                    String posicion = scanner.next();
                    lista.agregar(new Nodo(tipo, dimensiones, material, posicion));
                    break;
                case 2:
                    lista.mostrarGrafico();
                    break;
                case 3:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
