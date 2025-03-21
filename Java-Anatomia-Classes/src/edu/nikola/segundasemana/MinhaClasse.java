package edu.nikola.segundasemana;

public class MinhaClasse 
{  
    public static void main(String[] args) 
    {
 //       String nome = (System.in.read()).ToString;
        String primeiroDigito = "1", segundoDigito = "2";
        
        System.out.println(todosDigitos(primeiroDigito, segundoDigito));
    }

    public static String todosDigitos (String primeiroDigito, String segundoDigito)
    {
        return primeiroDigito + segundoDigito;
    }

}
