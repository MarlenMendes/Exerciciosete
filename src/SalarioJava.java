import java.util.Scanner;

public class SalarioJava {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println( " Qual o seu salário ");

        double salario = entradaDoUsuario.nextDouble();
        double salarioMinimo = salario / 1212.00;

        System.out.printf( "Você ganha: %.2f salarios mínimos " , salarioMinimo );


    }
}
