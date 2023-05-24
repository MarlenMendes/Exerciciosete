import java.util.Scanner;

public class IdadeJava {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Calculadora de idade em dia ");

        System.out.print(" Digite os anos: ");
        int anos = entrada.nextInt();

        System.out.println( " Digite quantos meses voce tem: ");
        int meses = entrada.nextInt();

        System.out.println(" quantos dias voce tem: ");
        int dia = entrada.nextInt();

        int tano = anos * 365;
        int tmes = meses * 30;

        System.out.println ("Sua idade em dias são:" + (tano + tmes + dia));






    }
}
