package atvs_java;
import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Qual o primeiro número?");
            Float N1 = ent.nextFloat();
            System.out.println("Qual o segundo número?");
            Float N2 = ent.nextFloat();

            Float calc = N1+N2;
            System.out.println(calc);
        }
        
    }
}
