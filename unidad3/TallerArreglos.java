public class TallerArreglos{
    public static void main(String[] args) {
        String [] productos={"arroz","leche","pan","huevos"};
        int[ ]codigos={245,108,245,731};
        int[] cantidades={40,15,20,30};

    }
    public static String determinarMayorCantidad(String [] productos,int[] cantidades){
        String mensaje="El producto con mayor cantidad es: ";
        int posicion=0;
        int mayor=cantidades[0];
        for (int i=0;i<cantidades.length;i++){
            if (cantidades[i]<mayor){
                mayor=cantidades[i];
                posicion=i;
            }
        }
        mensaje+=productos[posicion];
        return mensaje;
    }
    public static String determinarMenorCantidad(String [] productos,int[] cantidades){
        String mensaje="El producto con menor cantidad es: ";
        int posicion=0;
        int menor=cantidades[0];
        for (int i=0;i<cantidades.length;i++){
            if (cantidades[i]>menor){
                menor=cantidades[i];
                posicion=i;
            }
        }
        mensaje+=productos[posicion];
        return mensaje;
    }
    public static int recorrerCantidades(int [ ]cantidades){
        int contador=0;
        for (int i=0;i<cantidades.length;i++){
            if( cantidades[i]>20){
                contador++;
            }
        }
        return contador;
    }
    public static String [] contarLongitud(int[] cantidades, String [] productos, int contador){
        String[] nuevoArreglo=new String [contador];
        int j=0;
        for (int i=0; i<cantidades.length;i++){
            if (cantidades[i]>20){
                nuevoArreglo[j]=productos[i];
                j++;
            }
        }
        return nuevoArreglo;
    }
    public static String mostrarElementosNuevoArreglo(String[] nuevoArreglo){
        String mensaje="";
        for (String nuevo:nuevoArreglo){
            mensaje+=nuevo;
        }
        return mensaje;
    }
    
    public static String encontrarNombreLargo(String[] productos){
        String mensaje="El producto con el nombre más largo es: ";
        String mayor=productos[0];
        for (int i=0; i<productos.length;i++){
            if( productos[i].length()>mayor.length()){
                mayor=productos[i];
            }
        }
        mensaje+=mayor;
        return mensaje;
    }
    public static String encontrarNombreCorto(String[] productos){
        String mensaje="El producto con el nombre más largo es: ";
        String menor=productos[0];
        for (int i=0; i<productos.length;i++){
            if( productos[i].length()<menor.length()){
                menor=productos[i];
            }
        }
        mensaje+=menor;
        return mensaje;
    }
    public static String encontrarNombresVocal(String [] productos) {
        String mensaje="Los productos que empiezan por vocal son: ";
        for (int i=0;i<productos.length;i++){
            char letra=productos[i].charAt(0);
            if (Repositorio.identificarVocal(letra)){
                mensaje+=productos[i];
            }
        }
        return mensaje;
    }
    
    public static[] int contarConsonantes(String[] productos){
        int[] contador=new int[productos[]];
        for (int i=0; i<productos.length;i++){
            String producto=productos[i];
            char letra=producto.charAt(i);
            if (!Repositorio.identificarVocal(letra)){
                contador++;
            }   
        }
        return contador;
    }
    public static String mostrarCantidadConsonante(int consonantes,String[] productos){
        String mensaje="La cantidad de consonantes de cada producto es: ";
        for (String producto:productos){
            mensaje+=producto+": "+ consonantes+"\n";
        }
        return mensaje;
    }
}