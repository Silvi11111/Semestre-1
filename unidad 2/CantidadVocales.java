public class CantidadVocales {
    public static void main(String[] args) {
        String nombre=Repositorio.ingresarTexto("Digite su nombre: ");
        int cantidadVocales=contarVocales(nombre);
        System.out.print("hay "+cantidadVocales+" vocales en el nombre "+ nombre);
    }
    public static boolean identificarVocal(char letra){
        boolean esVocal=false;
        if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
            esVocal=true;
        }
        return esVocal;
    }
    public static int contarVocales(String nombre){
        int contarVocales=0;
        for (int i=0;i<nombre.length();i++){
            char letra=nombre.charAt(i);
            if (Repositorio.identificarVocal(letra)){
                contarVocales++;
            }
        }
        return contarVocales;
    }
}
