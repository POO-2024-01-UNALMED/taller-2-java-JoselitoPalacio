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
                contador++;
            }
        }
    }
    String verificarIntegridad(){
        if(this.registro == this.motor.registro) {
            for( int i = 0; i <asientos.length; i++){
                if(asientos[i] != null){
                    if(asientos[i].registro != registro){
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }
        else{
            return "Las piezas no son originales";
        }
    }
}


