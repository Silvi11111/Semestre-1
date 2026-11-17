public class CostoPaquete {
    public static void main(String[] args) {
        //1 Ingresar peso 
        double peso=Repositorio.ingresarNumeroDecimal("Ingrese el peso del paquete(kg): ");
        //2. Ingresar distancia
        double distancia=Repositorio.ingresarNumeroDecimal("Ingrese la distancia a recorrer(km)): ");
        //3. Ingresar el tipo de cliente 
        String tipoCliente=Repositorio.ingresarTexto("¿Qué tipo de cliente es?");
        //4. Calcular costoBase
        double costoBase=costo(peso,distancia);
        //5. Determinar costoTotal
        String costoTotal=determinarCosto(costoBase,tipoCliente);
        //6. Mostrar mensaje
        System.out.print(costoTotal);
    }
    public static double costo(double pesos,double distancias){
        return (pesos*2500)+(distancias*30);
    }
    public static String determinarCosto(double costos,String cliente){
        String mensaje="";
        if(cliente.equalsIgnoreCase("registrado")&& costos<=100000){
            double valorTotal=costos-(costos*0.1);
            mensaje+="Cliente registrado y compra menor a 100.000, su total es de "+valorTotal;
        }else if(cliente.equalsIgnoreCase("invitado")&& costos>80000){
            double valorTotal=costos-(costos*0.2);
            mensaje+="Cliente invitado y compra superior a 80.000, su total es de "+valorTotal;
        }else{
            mensaje+="Su total es de "+ costos;
        }
        return mensaje;
    }
}
