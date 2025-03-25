import java.util.concurrent.ThreadLocalRandom;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Logica {
    public static void main(String[] args) throws Exception 
    {
        /*int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int numero : array)
        {
            if(numero == 5)
            {
                System.out.println(numero);
                System.out.println("Máximo excedido");
                break;
            }
            System.out.println(numero);
        }
        */

        BigDecimal mesada = new BigDecimal(50.0);

        while (mesada.compareTo(BigDecimal.ZERO) > 0)
        {
            BigDecimal valorDoce = new BigDecimal (valorAleatorio()).setScale(2, RoundingMode.HALF_UP);
            if (valorDoce.compareTo(mesada) > 0) valorDoce = mesada;
            
            System.out.println("Doce do valor R$" + valorDoce + " adicionado no carrinho");

            mesada = mesada.subtract(valorDoce);
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em doces");



    }

    private static double valorAleatorio()
    {
        return ThreadLocalRandom.current().nextDouble(1,10);
    }

}