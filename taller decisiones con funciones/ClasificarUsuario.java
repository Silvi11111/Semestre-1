public class ClasificarUsuario {
    public static void main(String[] args) {
        //1 Ingresar peso 
        double peso=Repositorio.ingresarNumeroDecimal("Ingrese su peso(kg): ");
        //2. Ingresar estatura
        double estatura=Repositorio.ingresarNumeroDecimal("Ingrese su estatura (mts): ");
        //3. Calcular IMC
        double imc=calcularImc(peso,estatura);
        //4. Clasificar usuario
        String usuario=clasificarUsuario(imc);
        //5. Mostrar resultado
        System.out.print(usuario);
    }
    public static double calcularImc(double pesos,double estaturas){
        return pesos/(Math.pow(estaturas, 2));
    }
    public static String clasificarUsuario(double imcs){
        String mensaje="";
        if (imcs>=25 && imcs<30){
            mensaje+="está por encima de su peso ideal, tiene sobrepeso";
        }else if(imcs>=30){
            mensaje+="Está por encima de su peso ideal, tiene obesidad";
        }else if (imcs>=18.5){
            mensaje+="Está en su peso ideal";
        }
        else{
            mensaje+="Está por debajo de su peso ideal, tiene falta de peso";
        }
        return mensaje;
    }
}
