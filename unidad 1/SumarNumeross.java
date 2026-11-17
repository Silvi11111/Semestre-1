public class SumarNumeross {
    //Constantes
    public static final int NUMERO1=5,NUMERO2=10;
    public static void main(String[]args){
        //Invocación d ela función sumarNumeros
        int suma=sumarNumeros(NUMERO1,NUMERO2);
        //Mostrar resultado
        System.out.print("La suma es: "+ suma);
    }
    //Función de sumar numeros
    public static int sumarNumeros(int numero1,int numero2){
        return numero1+numero2;
    }
}
