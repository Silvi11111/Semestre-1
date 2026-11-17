/*programa que valida entrada
autores: área de programación
fecha: marzo del 2026
licencia: GNU GPL V3
 */
import java.util.Scanner;

public class Punto4{
    public static final int PESO=2500, DISTANCIA=30,PRECIO_CALCULADO=200000, COSTO_tRANSPORTE=100000;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //1. Ingresar peso
        System.out.print("Ingrese el peso del paquete: ");
        int peso=sc.nextInt();

        //2. Ingresar la distancia
        System.out.print("Ingrese la distancia en kilogramos: ");
        int distancia=sc.nextInt();

        //3. Ingresar el tipo de cliente
        System.out.print("Ingrese el tipo de cliente que es: ");
        String tipoCliente=sc.nextLine();

        //4.Calcular el costo
        int costo=(peso*PESO)+(distancia*DISTANCIA);

        String mensaje="";

        //5. Determinar envio
        if (tipoCliente.equalsIgnoreCase("premium")&& peso<=20){
            double costoPremium=costo-(costo*0.2);
            mensaje+="El costo de su paquete es de "+costoPremium+" Y recibió el 20% de descuento por ser premium y tener el paquete en menos o igual a 20Kg";
        }else if (tipoCliente.equalsIgnoreCase("frecuente") && costo<=PRECIO_CALCULADO){
            
        }else if (tipoCliente.equalsIgnoreCase("invitado") && costo<COSTO_tRANSPORTE){
            
        }

    }
}