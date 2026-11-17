
public class TecnoMarket {
    public static final double IVA=0.19;
    public static void main(String[]args){

        //ingresar valores
        double laptop=Repositorio.ingresarNumeroDecimal("Ingrese el valor de la laptop: ");
        double monitor=Repositorio.ingresarNumeroDecimal("Ingrese el valor del monitor: ");
        double teclado=Repositorio.ingresarNumeroDecimal("Ingrese el valor del teclado: ");
        double mouse=Repositorio.ingresarNumeroDecimal("Ingrese el valor del mouse: ");
        double audifonos=Repositorio.ingresarNumeroDecimal("Ingrese el valor de los audifonos: ");

        //Iva de los productos
        double laptopIva=laptop+(laptop*IVA);
        double monitorIva=monitor+(monitor*IVA);
        double tecladoIva=teclado+(teclado*IVA);
        double mouseIva=mouse+(mouse*IVA);
        double audifonosIva=audifonos+(audifonos*IVA);

        //total compra
        double compra=laptopIva+monitorIva+tecladoIva+mouseIva+audifonosIva;

        //preguntas
        int clientefrecuente=Repositorio.ingresarNumeroEntero("Es usted un cliente frecuente?\n(1. si 2. no) ");
        int metodoPago=Repositorio.ingresarNumeroEntero("Cuál es su método de pago?\n(1. Efectivo 2. Tarjeta ");

        double descuentoClienteFrecuente=compra-(compra*0.1);
        double recargoTarjeta=compra+(compra*0.02);

        String mensaje="";

        if (clientefrecuente==1 && metodoPago==2){
            double clientefrecuenteRecargo=descuentoClienteFrecuente+(descuentoClienteFrecuente*0.02);
            mensaje+="Usted cliente frecuente, tiene descuento del 10% y por el pago en tarjeta, su monto en total es: "+clientefrecuenteRecargo;
            
        }else if (clientefrecuente==1 && metodoPago==1) {
            mensaje+="usted cliente frecuente, tiene descuento del 10% y por pagar en efectivo, su monto en total es: "+descuentoClienteFrecuente;

        }else if (clientefrecuente==2 && metodoPago==1) {
            mensaje+="Usted cliente, el valor total de su compra es:"+compra;
        
        }
    }
}
