public class ProtesisDental {
    Nodo cabeza;

    public ProtesisDental() {
        cabeza = null;
    }

    // Método para agregar un nodo al final
    public void agregar(Nodo nuevo) {
        if (nuevo != null) {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    // Método para mostrar lista gráfica en la consola
    public void mostrarGrafico() {
        Nodo actual = cabeza;
        System.out.println("Visualización de Prótesis Dental:");
        while (actual != null) {
            System.out.println("+---------------------------+");
            System.out.println("| Tipo: " + actual.tipo);
            System.out.println("| Dimensiones: " + actual.dimensiones);
            System.out.println("| Material: " + actual.material);
            System.out.println("| Posición: " + actual.posicion);
            System.out.println("+---------------------------+");
            if (actual.siguiente != null) {
                System.out.println("           ↓");
            }
            actual = actual.siguiente;
        }
        System.out.println("Fin de la lista.");
    }
}
