import java.util.Scanner;

public class VerificarVisitantes {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("- Acceso al parque -\n");
        
        //1. Ingresar edad
        System.out.print("Ingrese su edad: ");
        int edad=scanner.nextInt();
        scanner.nextLine();
        //2. Determinar membresia
        System.out.print("¿Tiene acceso VIP? ");
        String membresia=scanner.nextLine();

        //3. Determinar el acceso y mostrarlo
        if (edad>=18 && membresia.equalsIgnoreCase("si")){
            System.out.print("Acceso concedido, tiene un 10% de descuento en la entrada");
        }else{
            System.out.print("Ingreso no válido y lastimosamente no tiene descuento");
        }
    }
}
