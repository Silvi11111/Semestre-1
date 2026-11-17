/*sacar 5 notas y decir si pasó o no */
import java.util.Scanner;

public class SacarNotas {
    public static void main(String[]args){
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("1° nota: ");
        double nota1= scanner.nextDouble();

        System.out.print("2° nota: ");
        double nota2= scanner.nextDouble();

        System.out.print("3° nota: ");
        double nota3= scanner.nextDouble();

        System.out.print("4° nota: ");
        double nota4= scanner.nextDouble();
        
        System.out.print("5° nota: ");
        double nota5= scanner.nextDouble();

        double nota= (nota1+nota2+nota3+nota4+nota5)/5;

        System.out.print("Su nota fue de: "+nota+"\n");

        if(nota>=3){
            System.out.print("Aprobó :D");
        }else{
            System.out.print("Reprobó D:");
        }

    }
}
