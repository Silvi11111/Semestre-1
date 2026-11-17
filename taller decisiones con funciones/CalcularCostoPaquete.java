public class CalcularCostoPaquete {
    public static void main(String[] args) {
        //1 Ingresar peso 
        double peso=Repositorio.ingresarNumeroDecimal("Ingrese el peso del paquete(kg): ");
        //2. Ingresar distancia
        double distancia=Repositorio.ingresarNumeroDecimal("Ingrese la distancia a recorrer(km)): ");
        //3. Ingresar urgencia 
        String urgencia=Repositorio.ingresarTexto("¿Es urgente el pedido?");
        //4. Calcular costobase 
        double costoBase=costo(peso);
        //5. Determinar costoTotal
        String costoTotal=determinarCosto(peso,distancia,urgencia,costoBase);
        //6. Mostrar mensaje
        System.out.print(costoTotal);
    }
    public static double costo(double pesos){
        return pesos*2000;
    }
    public static String determinarCosto(double pesos,double distancias,String urgencias,double costoBases){
        String mensaje="";
        if (pesos>10 && distancias>50){
            double total=costoBases+(costoBases*0.2);
            mensaje+="Se le aplica recargo del 20%, su total es de "+total;
        }else if (pesos<5){
             double total=costoBases-(costoBases*0.1);
            mensaje+="Se le aplica descuento del 10%, su total es de "+total;
        }else if (urgencias.equalsIgnoreCase("si")){
            double total=costoBases+(costoBases*0.4);
            mensaje+="Se le aplica recargo del 40%, su total es de "+total;
        }else{
            mensaje+="Su total es de "+costoBases;
        }
        return mensaje;
    }
}
