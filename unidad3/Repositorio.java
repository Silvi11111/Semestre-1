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

    //Identificar vocal
    public static boolean identificarVocal(char letra){
        boolean esVocal=false;
        if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
            esVocal=true;
        }
        return esVocal;
    }
    //Ingresar arreglo de texto
    public static String[] ingresarArregloTexto(int cantidad, String mensaje){
        String [] nuevoArreglo=new String[cantidad];
        for (int i=0;i<cantidad;i++){
            nuevoArreglo[i]=ingresarTexto(mensaje+"("+(i+1)+" de "+cantidad+") :");
        }
        return nuevoArreglo;
    }
    //Arreglo numero entero
    public static int[] ingresarArregloEnteros(int cantidad, String mensaje){
        int [] nuevoArreglo=new int[cantidad];
        for (int i=0;i<cantidad;i++){
            nuevoArreglo[i]=ingresarNumeroEntero(mensaje+"("+(i+1)+" de "+cantidad+") :");
        }
        return nuevoArreglo;

    }
    //Arreglo numero decimal
    public static double[] ingresarArregloDecimales(int cantidad, String mensaje){
        double[] nuevoArreglo=new double[cantidad];
        for (int i=0;i<cantidad;i++){
            nuevoArreglo[i]=ingresarNumeroDecimal(mensaje+"("+(i+1)+" de "+cantidad+") :");
        }
        return nuevoArreglo;

    }
    //Arreglo booleano
    public static boolean[] ingresarArregloBooleanos(int cantidad, String mensaje){
        boolean[] nuevoArreglo=new boolean[cantidad];
        for (int i=0;i<cantidad;i++){
            nuevoArreglo[i]=ingresarBoolean(mensaje+"("+(i+1)+" de "+cantidad+") :");
        }
        return nuevoArreglo;

    }
}
