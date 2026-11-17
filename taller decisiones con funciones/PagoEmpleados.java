public class PagoEmpleados {
    public static void main(String[] args) {
        //1. Ingresar cantidad de horas
        int horas=Repositorio.ingresarNumeroEntero("Ingrese la cantidad de horas trabajadas: ");
        //2. Ingresar tipoContrato
        String contrato=Repositorio.ingresarTexto("Tiene contrato fijo?");
        //3. Calcular horas trabajadas
        int horasTrabajadas=calcularHoras(horas);
        //4. Determinar pago
        String total=determinarPago(horas,contrato,horasTrabajadas);
        //5. Mostrar mensaje
        System.out.print(total);
    }
    public static int calcularHoras(int hora){
        return hora*10000;
    }
    public static String determinarPago(int hora, String contratos, int horaTrabajada){
        String mensaje="";
        if (hora>50 && contratos.equalsIgnoreCase("si")){
            double total=horaTrabajada*2;
            mensaje+="Su pago por tener mas de 50 horas es de: "+total;
        }else if(hora>40 && contratos.equalsIgnoreCase("si")){
            double total=horaTrabajada+(horaTrabajada*0.5);
            mensaje+="Su pago por tener mas de 40 horas es de: "+total;
        }else if(contratos.equalsIgnoreCase("no")){
            double total=horaTrabajada-(horaTrabajada*0.1);
            mensaje+="Su pago por no tener contrato fijo es de: "+total;
        }else{
            mensaje+="Su pago es de: "+horaTrabajada;
        }
        return mensaje;
    }
}
