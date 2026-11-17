/*
Programa para imprimir datos
Autores: Área de progranmación
Fecha: febrero del 2026
Licencia: GNU GPL V3
 */

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[]args){

        Scanner scanner=new Scanner (System.in);

        //Ingresar nombre
        System.out.println("Ingrese el nombre: ");
        String nombre=scanner.nextLine();

        //ingresar edad
        System.out.println("Ingrese la edad: ");
        int edad=scanner.nextInt();

        //ingresar estatura
        System.out.println("Ingrese la estatura: ");
        double estatura=scanner.nextDouble();

        //Procesar y mostrar datos
        System.out.println("Nombre: "+nombre+
            "\n Edad: "+edad+
            "\n Estatura: "+ estatura);
    }
}
