public class OperadoresLogicos {
    public static void main(String[]args){
        //ejemplos de operadores lógicos
        System.out.println("-Operadores lógicos-");

        //operador lógico AND
        System.out.println("AND:");

        boolean a=3>5 && 4<2;
        System.out.println("a= "+a);

        boolean b=3*2==2*3 && Math.pow(2, 3)>Math.pow(1, 2);
        System.out.println("b= "+b);

        boolean c=1+4-8!=2*4/8 && 3*7+1>2*8;
        System.out.println("c= "+c);

        boolean d=7+3==3+7 && 6*2<=2*6;
        System.out.println("d= "+d);

        boolean estaLloviendo=true;
        boolean tengoDinero=false;
        boolean puedoSalir= estaLloviendo && tengoDinero;
        System.out.println("puedo salir?= "+puedoSalir);

        //operador lógico OR
        System.out.println("OR:");
        
        boolean aa=8>5 || 4<2;
        System.out.println("a= "+aa);

        boolean bb=3*2==2*3 || Math.pow(2, 3)>Math.pow(1, 2);
        System.out.println("b= "+bb);

        boolean cc=3+2-4!=2*2/4 || 3*4+8>=2*2*4;
        System.out.println("c= "+cc);

        boolean dd=5>9 || 2*4<Math.pow(4, 2);
        System.out.println("d= "+dd);

        boolean haceSol=true;
        boolean esDomingo= true;
        boolean voy= haceSol||esDomingo;
        System.out.println("voy a salir? "+ voy);

         //operador lógico NOT
        System.out.println("NOT:");

        boolean aaa=8<5 == !(3*2==2*3);
        System.out.println("a= "+aaa);

        boolean bbb=3+2-5!=2*2/5 == !(5>9);
        System.out.println("b= "+bbb);
    }
}