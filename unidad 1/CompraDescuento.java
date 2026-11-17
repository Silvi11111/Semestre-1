import java.util.Scanner;

public class CompraDescuento {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("-Factura-\n");

        System.out.print("Ingrese el valor de la compra: ");
        double compra=scanner.nextDouble();

        double descuento=compra*0.15;

        if (compra>500000){
            double factura=compra-descuento;
            System.out.print("Su compra en total es de: "+(int)factura+"\nSe le aplicó el 15% de descuento");
        }else{
            System.out.print("Su total es de: "+(int)compra+"\nSe quedó sin descuento por tacaño");
        }

    }
}
