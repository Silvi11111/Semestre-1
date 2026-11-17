/*repositorion para la reutilización de funciones
 */

import java.util.Scanner;

public class Repositorio {
    
    //Ingresar cadena de texto
    public static String ingresarTexto(String mensaje){
        Scanner sc=new Scanner(System.in);

        System.out.print(mensaje);
        String texto=sc.nextLine();
        
        return texto;
    }

    //Ingresar entero
    public static int ingresarNumeroEntero(String mensaje){
        Scanner sc=new Scanner(System.in);

        System.out.print(mensaje);
        int numeroEntero=sc.nextInt();
        return numeroEntero;
    }

    //Ingresar double
    public static double ingresarNumeroDecimal(String mensaje){
        Scanner sc=new Scanner(System.in);

        System.out.print(mensaje);
        double numeroDecimal=sc.nextDouble();
        return numeroDecimal;
    }

    //Ingresar boolean
    public static boolean ingresarBoolean(String mensaje){
        Scanner sc=new Scanner(System.in);

        System.out.print(mensaje);
        boolean bolean=sc.nextBoolean();
        return bolean;
    }
}
