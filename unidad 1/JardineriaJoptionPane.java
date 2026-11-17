/*
Programa para evaluar concidiones en zonas
Autores: Área de progranmación
Fecha: febrero del 2026
Licencia: GNU GPL V3
 */

/* Importamos el paquete donde
 * se encuenta la clase JOptionPane*/
import javax.swing.*;

public class JardineriaJoptionPane {
    public static void main(String[] args) {

        //1. entrada de datos

        //1.1. declarar una variable
        String longitud, ancho;
        int longitudReal,anchoReal;

        //1.2 Contruimos el cuadro de diálogo
        longitud=JOptionPane.showInputDialog("Ingrese la longitud: ");
        ancho=JOptionPane.showInputDialog("Ingrese la longitud: ");

        /*1.3 Almacenamos lo que tenemos en longitud y ancho, que es de tipo String
         * en la variable longitudReal y anchoReal, que es de tipo int, haciendo una
         * conversión de String a int*/
        longitudReal=Integer.parseInt(longitud);
        anchoReal=Integer.parseInt(ancho);


        //2. Calcular área
        int area= longitudReal*anchoReal;

        //3. Determinar zona adecuada
        boolean zonaAdecuada=(area>=60) && (longitudReal>anchoReal);

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
