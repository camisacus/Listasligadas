public class Nodo {
    String tipo;
    String dimensiones;
    String material;
    String posicion;
    Nodo siguiente;

    public Nodo(String tipo, String dimensiones, String material, String posicion) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.material = material;
        this.posicion = posicion;
        this.siguiente = null;
    }
}