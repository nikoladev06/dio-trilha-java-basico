public class Usuario {
    public static void main(String[] args) 
    {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    
        smartTv.ligar();
        smartTv.mudarCanal(256);
        System.out.println("Novo status: TV Ligada: " + smartTv.ligada);
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada: " + smartTv.ligada);
    
    
    }
}
