/*programa que valida entrada
autores: área de programación
fecha: marzo del 2026
licencia: GNU GPL V3
 */
import java.util.Scanner;

public class ValidarEntrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1. ingresar boleta
        System.out.print("¿Tiene boleta? ");
        String boleta=scanner.nextLine();
        //2. decisión
        if (boleta.equalsIgnoreCase("si")){
            System.out.print("¿Es usted VIP? ");
            String vip=scanner.nextLine();
            //2.1 decisión si hay boleta
            if (vip.equalsIgnoreCase("si")){
                System.out.print("Ingrese a la zona VIP");
            }else{
                System.out.print("Ingrese a la zona general");
            }
        }else{
            System.out.print("Compre su boleta para poder ingresar");
        }
    }
}
