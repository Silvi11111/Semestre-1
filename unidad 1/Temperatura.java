import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese la temperatura: ");
        int temperatura=scanner.nextInt();

        String mensaje="El clima es ";

        if (temperatura>=30){
            mensaje+="caloroso";
        }else if(temperatura>=20){
            mensaje+="agradable";
        }else if(temperatura>=10){
            mensaje+="frío";
        }else{
            mensaje+="súper frío";
        }
        System.out.print(mensaje);
        scanner.close();
    }
}
