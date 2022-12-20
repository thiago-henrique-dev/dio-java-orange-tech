public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -> Tv ligada: " + smartTV.ligada);

        smartTV.desligar();

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.dimunuirCanal();
        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.mudarCanal(13);
        System.out.println("Canal atual :" + smartTV.canal);
    }
}
