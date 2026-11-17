public class IntroduccionCiclosWhile {
    public static void main(String[] args) {
       
        String mensaje=preguntarDatos();
        System.out.print(mensaje);
        
    }
    public static String preguntarDatos(){

        String mensaje="";

        int i=1;
        String nombre="";
        
        int edad=0;

        while (i<=2){
            nombre=Repositorio.ingresarTexto("\n¿Cuál es su nombre? ");
            edad=Repositorio.ingresarNumeroEntero("¿Cuál es su edad? ");

            mensaje+=("El nombre del compañero "+i+" es "+nombre+" y tiene "+edad+" años.\n");

            i+=1;
        }
        return mensaje;
    }
}
