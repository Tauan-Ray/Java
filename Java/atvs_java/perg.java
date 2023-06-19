package atvs_java;
import java.util.Scanner;

public class perg {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Insira um número");
            Float N1 = ent.nextFloat();
            System.out.println("Insira outro número");
            Float N2= ent.nextFloat();

            System.out.println(N1+N2);
            System.out.println(N1-N2);
            System.out.println(N1*N2);
            System.out.println(N1/N2);
        }
        
    }
}
