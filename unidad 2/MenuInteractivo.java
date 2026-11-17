public class MenuInteractivo {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu(){
        int opcion=0;
        do{

            System.out.println("\n====MENÚ====");
            System.out.println("1. Saludar");
            System.out.println("2. Determinar si una palabra es palíndromo");
            System.out.println("3. Determinar si un número entero es capicúa");
            System.out.println("4. Determinar si un número es primo");
            System.out.println("5. Salir");
            opcion+=Repositorio.ingresarNumeroEntero("Ingrese una opción: ");
            switch(opcion){
                case 1:
                    System.out.println("Bienvenido...");
                break;
                case 2:
                    String palabra=Repositorio.ingresarTexto("Ingrese la palabra: ");
                    boolean palindroma=determinarPalindromo(palabra);
                    System.out.println("La palabra "+palabra+" es "+palindroma);
                    break;
                
                case 3:
                    int numero=Repositorio.ingresarNumeroEntero("Ingrese el número: ");
                    boolean capicua=determinarCapicua(numero);
                    System.out.println("El número "+numero+" es "+capicua);
                     break;
                case 4:

                    break;
                case 5:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while(opcion!=5);
    }
    public static boolean determinarPalindromo(String palabra){
        boolean esPalindromo=true;
        for (int i=0;i<=palabra.length()/2;i++){
            if(palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i)){
                esPalindromo=false;
                break;
            }
        }
        return esPalindromo;
    }
    public static boolean determinarCapicua(int numero){
        boolean esCapicua=false;
        int invertido=0;
        for (int i=numero;i>0;i/=10){
            int ultimoNumero=i%10;
            invertido=invertido*10+ultimoNumero;
        }
        if (numero==invertido){
            esCapicua=true;
        }
        return esCapicua;
    }
}
