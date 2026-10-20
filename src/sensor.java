public class sensor {
    public String nombre;
    public double lectura;
    String tipo;
    String unidad;

    public void mostrarInformacion() {
        System.out.println("Sensor - Nombre: " + nombre + " | Tipo: " + tipo + " | Unidad: " + unidad + " | Lectura: " + lectura);
    }

    public void actualizarLectura(double nuevaLectura) {
        lectura = nuevaLectura;
        System.out.println("Lectura actualizada para " + nombre + ": " + lectura + " " + unidad);
    }

    void mostrarLectura() {
        System.out.println("Lectura actual (" + nombre + "): " + lectura + " " + unidad);
    }

    void reiniciarLectura() {
        lectura = 0.0;
        System.out.println("Lectura de " + nombre + " reiniciada a 0.");
    }

}
