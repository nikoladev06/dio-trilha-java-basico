import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        /*
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome);

        int numero = 5;

        System.out.println(numero = 6);
        System.out.println(numero);
        */

        int a = 9, b = 10;

        String resultado = a==b? "verdadeiro":"falso";
        String acho = input.nextLine();
        System.out.println("Você acha que é " + acho + " mas o resultado é " + resultado);



    }

    public static double soma(double primeiroNumero, double segundoNumero)
    {
        double soma = primeiroNumero + segundoNumero;

        return soma;
    }
}
