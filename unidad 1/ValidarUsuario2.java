import java.util.Scanner;

public class ValidarUsuario2 {

    public static final String USUARIO="Lui";
    public static final String CONTRASENIA="123@";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("- Validación de datos -\n");

        System.out.print("Ingrese su usuario: ");
        String usuario=scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasenia=scanner.nextLine();
        
        // Decisión
        if (usuario.equals(USUARIO) && contrasenia.equals(CONTRASENIA)){
            System.out.print("Datos validados, puede continuar");
        }else if(usuario.equals(USUARIO)){
            System.out.print("Verifique su contraseña");
        }else if(contrasenia.equals(CONTRASENIA)){
            System.out.print("Verifique su usuario");
        }else{
            System.out.print("Datos no validos");
        }
    }
}
