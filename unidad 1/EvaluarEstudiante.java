/*programa que evalúa si pasa o no la materia
autores: área de programación
fecha: marzo de 2026
licencia:GNU GPL V3
 */
import java.util.Scanner;

public class EvaluarEstudiante{
    public static void main(String[]args){

        Scanner scanner= new Scanner(System.in);
        //1. ingresar nota
        System.out.print("Ingrese su nota: ");
        double nota=scanner.nextDouble();
        //2. ingresar asistencia
        System.out.print("Ingrese la asistencia: ");
        int asistencia=scanner.nextInt();

        //3. mensaje y decisión
        String mensaje="Usted ha ";

        if (nota>=4.5 && asistencia>=90){
            mensaje+="aprovado con excelencia";
        }else if (nota>=3 && asistencia>=90) {
            mensaje+=" aprovado la materia";
        }else if(nota>=3 & asistencia<80){
            mensaje+="perdido por inasistencia";
        }else if (nota<3 && asistencia>=80){
            mensaje+="perdido por nota";
        }else {
            mensaje+="perdido por nota e inasistencia";
        }
    //4. mostrar mensaje
    System.out.print(mensaje);
    }
}
