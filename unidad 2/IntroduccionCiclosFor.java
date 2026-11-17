public class IntroduccionCiclosFor {
    public static void main(String[] args) {
       
        String mensaje=preguntarDatos();
        System.out.print(mensaje);
        
    }
    public static String preguntarDatos(){

        String mensaje="";

        for (int i=1;i<=2;i+=1){
            String nombre=Repositorio.ingresarTexto("\n¿Cuál es su nombre? ");
            int edad=Repositorio.ingresarNumeroEntero("¿Cuál es su edad? ");

            mensaje+=("El nombre del compañero "+i+" es "+nombre+" y tiene "+edad+" años.\n");

        }
        return mensaje;
    }
}
