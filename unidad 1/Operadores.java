public class Operadores {
    public static void main(String[] args) {
        //Ejemplos de operaciones y expresiones aritméticas
        int x=1+(10+6*6+7)+(18/2)/3/1+2;
        double z=12/3.0+3-(10/4.0*2-3)+8/3.0+(10-3+5);
        double y=(5*(25/5.0)+3%2)/(3*2-12/4);
        double a=(7+5%2*4)/(16*(1/2.0)*2+3);
        double b1=(4*22/10.0)+Math.pow(4*2+3*2 , 1/2.0);
        //o tambien
        double b2=(4*22/10.0)+Math.sqrt(4*2+3*2);
        double c=(3*2+5%3/2)/(1);

        System.out.println("x= "+x);
        System.out.println("z= "+z);
        System.out.println("y= "+y);
        System.out.println("a.= "+a);
        System.out.println("b.= "+b1);
        System.out.println("b.= "+b2);
        System.out.println("c.= "+c);
    }
}
