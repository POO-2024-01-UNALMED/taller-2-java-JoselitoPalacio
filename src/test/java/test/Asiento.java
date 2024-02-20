package test;
public class Asiento {
    int precio;
    String color;
    int registro;
    void cambiarColor(String color) {
        String[] colors = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String colores : colors) {
            if (color.equalsIgnoreCase(colores)) {
                this.color = color;
                return;
            }
        }
    }
}