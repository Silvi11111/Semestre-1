public class MenuCiclosAnidados{
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu(){
       int opcion=0;
        do { 
            System.out.println("===Menú===");
            System.out.println("1. Imprimir tablas");
            System.out.println("2. imprimir salones ");
            System.out.println("3. imprimir asteriscos descendentes");
            System.out.println("Salir");
            opcion=Repositorio.ingresarNumeroEntero("Ingrese la opción: ");

            switch(opcion){
                case 1:
                    int inicio=Repositorio.ingresarNumeroEntero("Ingrese la cantidad de tablas al inicio: ");
                    int fin=Repositorio.ingresarNumeroEntero("Ingrese la cantidad de tablas para finalizar: ");
                    String resultado=mostrarTablas(inicio, fin);
                    System.out.println(resultado);
                    break;
                case 2:
                    int salon=Repositorio.ingresarNumeroEntero("Ingrese el número de salones: ");
                    int fila=Repositorio.ingresarNumeroEntero("Ingrese el número de filas: ");
                    int puesto=Repositorio.ingresarNumeroEntero("Ingrese el número de puestos: ");
                    String mostrarResultado=mostrarSalones(salon, fila, puesto);
                    System.out.println(mostrarResultado);
                    break;
                case 3:
                    
                case 4:
                        System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            } 
        } while (opcion!=0);
        
    }
    public static String mostrarTablas(int inicio,int fin){
        String tabla="Las tablas de multiplicar de "+inicio+" al "+fin+" son:\n";
        for (int i=inicio;i<=fin;i++){
            tabla+="La tabla del "+i+" es:\n";
            for (int j=1;j<=10;j++){
                int multiplicacion=i*j;
                tabla+=i+" X "+j+" = "+multiplicacion+"\n";
            }
        }
        return tabla;
    }
    public static String mostrarSalones(int salones,int filas, int puestos){
        String mensaje="";
        for (int i=1;i<=salones;i++){
            mensaje+="Salón "+i+"\n";
            for (int k=1;k<=filas;k++){
                mensaje+="  Fila "+k+"\n";
                for (int l=1;l<=puestos;l++){
                    mensaje+="      Puesto "+l+"\n";
                }
            }
        }
        return mensaje;
    }
    public static String descenderAsteriscos(int cantidad){
        String mensaje="";
        for (int i=cantidad;i>=0;i--){
            
        }
    }
}