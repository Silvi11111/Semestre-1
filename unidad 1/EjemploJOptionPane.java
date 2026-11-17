/*
Programa para imprimir datos
Autores: Área de progranmación
Fecha: febrero del 2026
Licencia: GNU GPL V3
 */
import javax.swing.JOptionPane;

public class EjemploJOptionPane {
    public static void main(String[]args){

        //Ingresar nombre
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");

        //Ingresar edad
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));

        //Ingresar estatura 
        double estatura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura: "));

        //procesar y mostrar datos
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+
            "\n Edad"+edad+
            "\n Estatura: "+estatura);
    }
    
}
