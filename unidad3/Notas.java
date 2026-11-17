public class Notas {
    public static void main(String[] args) {
    int cantidad=Repositorio.ingresarNumeroEntero("Ingrese la cantidad de estudiantes: ");
    String [] nombresEstudiantes=Repositorio.ingresarArregloTexto(cantidad, "ingrese el nombre del estudiante");  
    double[] notas=Repositorio.ingresarArregloDecimales(cantidad, "Ingrese la nota");
    int contador=contarAprobados(notas);
    String []nombresAprobados=mostrarAprobados(nombresEstudiantes, notas, contador);
    String aprobados=mostrarArregloAprobados(nombresAprobados);
    String notaMayor=mostrarMayorNota(notas, nombresEstudiantes);
    String notaMenor=mostrarMenorNota(notas, nombresEstudiantes);
    String promedio=mostrarPromedio(notas);
    System.out.println(aprobados+notaMayor+notaMenor+promedio);
   
    
    }

    public static int contarAprobados(double[]notas){
        int contarAprobados=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=3){
                contarAprobados++;
            }
        }
        return contarAprobados;
    }

    public static String mostrarMayorNota(double[]notas,String [] nombresEstudiantes){
        String mensaje="\nEl estudiante que tiene mayor nota es: ";
        double mayor=notas[0];
        int posicion=0;
        for (int i=0; i<notas.length;i++){
            if (notas [i]>mayor){
                mayor=notas[i];
                posicion=i;
            }
        }
        mensaje+=nombresEstudiantes[posicion]+", su nota es de "+mayor+"\n";
        return mensaje;
    }

    public static String mostrarMenorNota(double[]notas,String [] nombresEstudiantes){
        String mensaje="\nEl estudiante que tiene menor nota es: ";
        double menor=notas[0];
        int posicion=0;
        for (int i=0; i<notas.length;i++){
            if (notas [i]<menor){
                menor=notas[i];
                posicion=i;
            }
        }
        mensaje+=nombresEstudiantes[posicion]+", su nota es de "+menor+"\n";
        return mensaje;
    }

    public static String mostrarPromedio(double[]notas){
        double suma=0;
        String mensaje="\nEl promedio es: ";
        for (int i=0;i<notas.length;i++){
            suma+=notas[i];
        }
        double promedio=suma/notas.length;
        mensaje+=promedio;
        return mensaje;
        
    }

    public static String[] mostrarAprobados(String[] nombres,double[]notas, int contarAprobados){
        String[] aprobados=new String [contarAprobados];
        int j=0;
        for (int i=0;i<notas.length;i++){
            if (notas[i]>=3){
                aprobados[j]=nombres[i];
                j++;
            }
        }
        return aprobados;
    }
    public static String mostrarArregloAprobados(String [] aprobados){
        String mensaje="los estudiantes que aprobaron la materia son:\n";
        for (String aprobado:aprobados){
            mensaje+=aprobado+"\n";
        }
        return mensaje;
    }
}
