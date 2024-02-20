package test;

public class Motor {
    int numeroCilindros;
	String tipo;
	int registro;
    void asignarTipo(String tipo) {
        String[] tiposPermitidos = {"electrico", "gasolina"};
        for (String tipoPermitido : tiposPermitidos) {
            if (tipo.equalsIgnoreCase(tipoPermitido)) {
                this.tipo = tipo;
                return;
            }
        }
    }
    void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }
}