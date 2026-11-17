public class TallerOperadoresLogicos {
    public static void main(String[] args) {

        //Taller de operadores lógicos

        boolean uno=(3>8 || 12<=15) && (25<30 || 7!=7);
        System.out.println("1. "+uno);

        boolean dos=(5>2 && 10>20) || (30<40 && 5>=5);
        System.out.println("2. "+dos);

        boolean tres=(20/4==5 && (3*2+2)<=11) || (12%5>2 && (10-5)*3>=15);
        System.out.println("3. "+tres);

        boolean cuatro=(5+3*2<2*4 && 18-3*2>10) || (15/3==5 && 10/3+2>=5);
        System.out.println("4. "+cuatro);

        boolean cinco=((4*5+2)/3>5 && Math.pow(6, 2)/3<15) || (25%4==3 && 10/3*2>=6);
        System.out.println("5. "+cinco);
    }
}
