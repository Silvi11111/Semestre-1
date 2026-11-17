public class IntroduccionArreglos {
    public static void main(String[] args) {
        String[]nombres={"Juan","María","Pedro","Mónica"};
        //length sin parentesis es un atributo del arreglo
        for (int i=0;i<=nombres.length; i++){
            System.out.println(nombres[i]);
        }
        //para agarrar los nombres con letra M al inicio
        for (int i=0;i<=nombres.length; i++){
            if (nombres[i].charAt(0)=='M'){
                System.out.println(nombres[i]);
            }
        }

        int[]edades={10,16,21,17};
        // edades
        for (int edad:edades) {
            System.out.println(edad);
        }
        // estatura
        double[]estaturas={1.80,1.65,1.7,1.90};
        for (double estatura:estaturas){
            System.out.println(estatura);
        }
    }
}
