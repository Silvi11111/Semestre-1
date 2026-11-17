public class introduccionArreglos2{
    public static void main(String[] args) {
        
        String [] nombres={"Juan","María","Pedro","Mónica"};
        int [] edades={20,16,21,22};
        double [] estaturas={1.80,1.65,1.7,1.90};

         for (int i=0;i<=nombres.length; i++){
            if (nombres[i].charAt(0)=='M' && edades[i]>=18){
                System.out.println(nombres[i]+" tiene "+edades[i]+" años y mide "+estaturas[i]);
            }
        }
    }
}
