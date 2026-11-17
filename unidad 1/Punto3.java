/*programa que valida entrada
autores: área de programación
fecha: marzo del 2026
licencia: GNU GPL V3
 */
//incompleto
import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese su promedio: ");
        double promedio=sc.nextDouble();

        String mensaje="";
        if (promedio>=3){
            System.out.print("Especifique el ingreso familiar: ");
            double ingreso=sc.nextDouble();
            if (ingreso<=4000000){
                System.out.print("ingrese la cantidad de materias: ");
            }
        }

    }
}
