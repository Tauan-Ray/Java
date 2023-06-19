package aula_02_03;

import java.util.Scanner;

public class media{
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Diga a sua primeira nota: ");
            float n1 = ent.nextFloat();
            System.out.println("Diga a sua segunda nota: ");
            float n2 = ent.nextFloat();
            float m = (n1+n2)/2;
            
            if (m >= 6){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
        }
    }
}
