

/*programa que valida entrada
autores: área de programación
fecha: marzo del 2026
licencia: GNU GPL V3
 */

public class Punto4Funciones{
    public static final int PESO=2500, DISTANCIA=30,PRECIO_CALCULADO=200000, COSTO_TRANSPORTE=100000;
    public static void main(String[] args) {

        //1. Ingresar peso
        int peso=Repositorio.ingresarNumeroEntero("Ingrese el peso del paquete: ");

        //2. Ingresar la distancia
        int distancia=Repositorio.ingresarNumeroEntero("Ingrese la distancia del vuelo en kilometros: ");

        //3. Ingresar el tipo de cliente
        String tipoCliente=Repositorio.ingresarTexto("Ingrese el tipo de cliente que es\nPremium, frecuente o invitado :");

        String resultado=determinarResultado(peso, distancia, tipoCliente);
        System.out.print(resultado);

    }
     public static String determinarResultado(int pesos, int distancias, String tipoClientes){

        //4.Calcular el costo
        int costo=(pesos*PESO)+(distancias*DISTANCIA);
        String mensaje="";

        //5. Determinar envio
        if (tipoClientes.equalsIgnoreCase("premium")&& pesos<=20){
            double costoPremium=costo-(costo*0.2);
            mensaje+="El costo de su paquete es de "+costoPremium+" Y recibió el 20% de descuento por ser premium y tener el paquete en menos o igual a 20Kg";
        }else if (tipoClientes.equalsIgnoreCase("frecuente") && costo<=PRECIO_CALCULADO){
            
        }else if (tipoClientes.equalsIgnoreCase("invitado") && costo<COSTO_tRANSPORTE){
            
        }
        return mensaje;
        }
}