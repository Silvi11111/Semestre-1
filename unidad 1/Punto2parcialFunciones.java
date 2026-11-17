public class Punto2parcialFunciones {
    public static void main(String[] args) {

        String mensaje=determinarResultado();
        System.out.print(mensaje);
    }
    public static String determinarResultado(){
        String mensaje="";
        double velocidadVehiculo=Repositorio.ingresarNumeroDecimal("Ingrese la velocidad del vehículo: ");

        if (velocidadVehiculo<80){
            mensaje+="velocidad dentro del límite\n";
            int experiencia=Repositorio.ingresarNumeroEntero("Ingrese los años de experiencia: ");
            if (experiencia>=2){
                mensaje+="Conductor con experiencia suficiente\n";
                int infracciones=Repositorio.ingresarNumeroEntero("Ingrese el número de infracciones hechas: ");
                if (infracciones==0 || experiencia>5){
                    double puntaje=(experiencia*10)-(infracciones*5);
                    mensaje+="Conductor confiable\nPuntaje de seguridad: "+puntaje+"\n";
                }else{
                    mensaje+="Historial de conductor riesgoso\n";
                }
            }else{
                mensaje+="Conductor con poca experiencia\n";
            }
        }else{
             mensaje+="Exceso de velocidad detectado\n";
        }
        return mensaje;
    }
}
