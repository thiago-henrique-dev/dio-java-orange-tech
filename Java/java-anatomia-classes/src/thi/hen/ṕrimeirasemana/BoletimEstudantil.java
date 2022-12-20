package thi.hen.ṕrimeirasemana;
import javax.print.attribute.standard.Media;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediFinal = 7;
        if(mediFinal < 6){
            System.out.println("Reprovado");
        } else if(mediFinal == 6) {
            System.out.println("Prova média");
        } else {
            System.out.println("Aprovado");
        }
    }
}
