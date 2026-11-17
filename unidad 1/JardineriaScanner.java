/*
Programa para evaluar concidiones en zonas
Autores: Área de progranmación
Fecha: febrero del 2026
Licencia: GNU GPL V3
 */

import java.util.Scanner;

public class JardineriaScanner {

    public static void main(String[] args) {

        //1. ingresar datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud: ");
        int longitud=scanner.nextInt();

        System.out.println("Ingrese el ancho: ");
        int ancho=scanner.nextInt();

        //2. Calcular área
        int area= longitud*ancho;

        //3. Determinar zona adecuada
        boolean zonaAdecuada=(area>=60) && (longitud>ancho);

        //4. Determinar zona óptima
        boolean zonaOptima=(area>=70 && area<=100) || !(area<50);

        //5. mostrar mensajes
        System.out.println("Longitud: "+ longitud + "\n"+
            "Ancho: "+ ancho+"\n"+
            "Área: "+ area+ "\n"+
            "Es adecuada la zona? "+ zonaAdecuada+"\n"+
            "Es óptima la zona? "+ zonaOptima
        );
    }
    
}
