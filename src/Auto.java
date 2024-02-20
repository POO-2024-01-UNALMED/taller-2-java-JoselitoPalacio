package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadcreados;

    int asientos(){
        int contador = 0;
        for(int i = 0; i < asientos.length; i++){
            if(asientos[i] != null){
                counter++;
            }
        }
    }
    String verificarIntegridad() {
        int registroAuto = registro;
        String mensaje = "Auto original";

        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registroAuto) {
                mensaje = "Las piezas no son originales";
                break;
            }
        }
    }

    
}

