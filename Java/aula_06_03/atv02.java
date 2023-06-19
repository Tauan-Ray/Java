package aula_06_03;
import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Quantas maçãs você deseja comprar? ");
            float m = ent.nextFloat();

            if (m < 12){
                Double f = (m*0.30);
                System.out.println("Você deve pagar R$"+f);

            }
            else{
                Double f = (m*0.25);
                System.out.println("Você deve pagar R$"+f);
            }
        }
    }
}
