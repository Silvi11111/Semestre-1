public class Numeros {
    public static void main(String[] args) {
        
    }
    public static String contarNumeros(){
        String mensaje="";
        int numero=Repositorio.ingresarNumeroEntero("Ingrese la cantidad que desea contar: ");
        for (int i=1;i<=numero;i+=1){
            mensaje+=i;
        }
    return mensaje;
    }
    
}
