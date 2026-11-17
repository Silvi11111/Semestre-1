import java.util.Scanner;

public class DecisionesSimpleCompuesta {
    public static void main (String[]args){

        //decisiones simples
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese la nota del parcial: ");
        double notaParcial=scanner.nextDouble();
        if (notaParcial>=3){
            System.out.print("Aprobó \n");
        }

        //Decisiones compuestas
        
        System.out.print("tengo dinero? ");
        boolean tengoDinero=scanner.nextBoolean();

        System.out.print("tengo permiso? ");
        boolean tengoPermiso=scanner.nextBoolean();

        if(tengoDinero && tengoPermiso){
            System.out.print("Puedo salir :D");
        }else{
            System.out.print("No puedo salir D;");
        }

    }
}
