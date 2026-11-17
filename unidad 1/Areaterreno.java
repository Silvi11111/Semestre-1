public class Areaterreno{
    public static void main(String[] args) {
        //1.ingresar longitud
        double longitud=Repositorio.ingresarNumeroDecimal("Ingrese la longitud: ");
        //2.ingresar ancho
        double ancho=Repositorio.ingresarNumeroDecimal("Ingrese la longitud: ");

        double area=calcularArea(longitud, ancho);
        //4.mostrar
        System.out.print("El área del rectangulo es: "+(int)area);
    }
    public static double calcularArea(double longitud, double ancho){
        //3.calcular área
        double area=longitud*ancho;
        return area;
        //
    }
}