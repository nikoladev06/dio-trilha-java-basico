public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try
        {
            String meuCep = formatarCep("140911602");
            System.out.println(meuCep);
        }
        catch (CepInvalidoException e)
        {
            e.printStackTrace();
            System.out.println("O cep não corresponde com as regras do negócio");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException
    {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep valido
        return "14.091-160";
    }
}
