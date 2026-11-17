
public class ValidacionUsuario {
    public static final String USUARIO1="lui",USUARIO2="juan",USUARIO3="laura",USUARIO4="mariana",USUARIO5="andres";
    public static final int CONTRASENIA1=123,CONTRASENIA2=456,CONTRASENIA3=789,CONTRASENIA4=012,CONTRASENIA5=345;

    public static void main(String[]args){

        //usuarios y contraseñas
        String usuario1= Repositorio.ingresarTexto("Ingrese el usuario 1: ");
        int contrasenia1= Repositorio.ingresarNumeroEntero("Ingrese la contraseña 1: ");
        String validacion1=validarIngreso(usuario1,USUARIO1,contrasenia1,CONTRASENIA1);
        System.out.print(validacion1);

        String usuario2= Repositorio.ingresarTexto("Ingrese el usuario 2: ");
        int contrasenia2= Repositorio.ingresarNumeroEntero("Ingrese la contraseña 2: ");
        String validacion2=validarIngreso(usuario2,USUARIO2,contrasenia2,CONTRASENIA2);
        System.out.print(validacion2);

        String usuario3= Repositorio.ingresarTexto("Ingrese el usuario 3: ");
        int contrasenia3= Repositorio.ingresarNumeroEntero("Ingrese la contraseña 3: ");
        String validacion3=validarIngreso(usuario3,USUARIO3,contrasenia3, CONTRASENIA3);
        System.out.print(validacion3);

        String usuario4= Repositorio.ingresarTexto("Ingrese el usuario 4: ");
        int contrasenia4= Repositorio.ingresarNumeroEntero("Ingrese la contraseña 4: ");
        String validacion4=validarIngreso(usuario4,USUARIO4,contrasenia4,CONTRASENIA4);
        System.out.print(validacion4);

        String usuario5= Repositorio.ingresarTexto("Ingrese el usuario 5: ");
        int contrasenia5= Repositorio.ingresarNumeroEntero("Ingrese la contraseña 5: ");
        String validacion5=validarIngreso(usuario5,USUARIO5,contrasenia5, CONTRASENIA5);
        System.out.print(validacion5);

    }

    public static String validarIngreso(String usuario, String usuarioQuemado,int contrasenia, int contraseniaQuemada){
        String mensaje="";
        if (usuario.equals(usuarioQuemado) && contrasenia==contraseniaQuemada){
            mensaje+="Login exitoso\n";
        }else{
            mensaje+="Acceso denegado\n";
        }
        return mensaje;
    }
}