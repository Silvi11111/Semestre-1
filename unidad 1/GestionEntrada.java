import java.util.Scanner;
public class GestionEntrada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        //Ingresar tipo de usuario
        System.out.print("Ingrese su tipo de usuario: ");
        String tipoUsuario=sc.nextLine();
        
        //Ingresar hora de ingreso
        System.out.print("Digite la hora de ingreso: ");
        int horaIngreso=sc.nextInt();
        //verificar datos 
        String mensaje="Usted ";
        if (tipoUsuario.equalsIgnoreCase("estudiante") && (horaIngreso>=6 && horaIngreso<20)){
            mensaje+="estudiante ";
        }else if(tipoUsuario.equalsIgnoreCase("profesor")){
            mensaje+="profesor ";
        }else if(tipoUsuario.equalsIgnoreCase("visitante")&&(horaIngreso<20)){
            mensaje+="visitante ";
        }else{
            System.out.print("No tiene permitido el acceso");
        }
        //Mostrar resultado
        System.out.print(mensaje+"puede ingresar a la zona de estudio");
    }
}
