package aula_06_03;

import java.util.Scanner;

public class atv04 {
    public static void main(String[] args){
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Diga a seu sexo [1.Feminino/2.Masculino]");
            int s = ent.nextInt();

            System.out.println("Diga a sua altura: ");
            float a = ent.nextFloat();

            if (s == 1){
                double f = (62.1 * a) - 44.7;
                System.out.println("Seu peso ideal é "+f);
            }
            else{
                double m = (72.7 * a) - 58;
                System.out.println("Seu peso ideal é "+m);
            }
        }
    }
}
