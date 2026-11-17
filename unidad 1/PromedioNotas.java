public class PromedioNotas{
    public static void main(String[] args) {
        double nota1=Repositorio.ingresarNumeroDecimal("Ingrese la primera nota: ");
        double nota2=Repositorio.ingresarNumeroDecimal("Ingrese la segunda nota: ");
        double nota3=Repositorio.ingresarNumeroDecimal("Ingrese la tercera nota: ");

        double promedio=calcularPromedio(nota1, nota2, nota3);
        String resultado=generarMensaje(promedio);

        System.out.print(resultado);
    }
    public static double calcularPromedio(double notas1,double notas2,double notas3){
        double promedio=(notas1+notas2+notas3)/3;
        return promedio;
    }
    public static String generarMensaje(double promedios){
        String mensaje="";
        if(promedios>=3){
            mensaje+="Su promedio es de "+Math.round(promedios)+", y ganó la materia";
        }else{
            mensaje+="Su promedio es de "+Math.round(promedios)+", y perdió la materia";
        }
        return mensaje;
    }
}