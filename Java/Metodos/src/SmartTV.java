
public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
        }

        public void aumentarCanal() {
            canal++;
            System.out.println("Aumentando o canal: " + canal);
        }

        public void dimunuirCanal() {
            canal++;
            System.out.println("Diminuir o canal: " + canal);
        }

        public void aumentarVolume() {
            volume++;
            System.out.println("Aumentando o volume: " + volume);
        }
        public void diminuirVolume() {
            volume--;
            System.out.println("Dimunuindo o volume: " + volume);
        }

        public void ligar() {
            ligada = true;
        }

        public void desligar() {
            ligada = false;
        }

}
