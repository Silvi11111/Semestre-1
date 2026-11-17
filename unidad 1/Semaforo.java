import java.util.Scanner;

public class Semaforo{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1. ingresar color
        System.out.print("Ingrese un color: ");
        String color=scanner.nextLine();
        //2. condicional

        String mensaje="Opciones de color:\n";

        if (color.equalsIgnoreCase("rojo")){
            mensaje+="PAREEEEEEEEE";
        }else if (color.equalsIgnoreCase("amarillo")){
            mensaje+="Preparese";
        }else if(color.equalsIgnoreCase("verde")){
            mensaje+="SIGAAAAAAAAAAA";
        }else{
            System.out.print("Color no identificado");
        }
        System.out.print(mensaje);
    }
}