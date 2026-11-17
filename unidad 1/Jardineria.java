/*
Programa para evaluar concidiones en zonas
Autores: Área de progranmación
Fecha: febrero del 2026
Licencia: GNU GPL V3
 */

public class Jardineria {

    //1. Determinar longitud y ancho
    public static final int LONGITUD=14;
    public static final int ANCHO=6;

    public static void main(String[] args) {
        //2. Calcular área
        int area= LONGITUD*ANCHO;

        //3. Determinar zona adecuada
        boolean zonaAdecuada=(area>=60) && (LONGITUD>ANCHO);

        //4. Determinar zona óptima
        boolean zonaOptima=(area>=70 && area<=100) || !(area<50);

        //5. mostrar mensajes
        System.out.println("Longitud: "+ LONGITUD + "\n"+
            "Ancho: "+ ANCHO+"\n"+
            "Área: "+ area+ "\n"+
            "Es adecuada la zona? "+ zonaAdecuada+"\n"+
            "Es óptima la zona? "+ zonaOptima
        );
    }
    
}
