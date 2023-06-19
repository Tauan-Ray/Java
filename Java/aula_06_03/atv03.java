package aula_06_03;

import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Diga o dia em que você nasceu: ");
            int d = ent.nextInt();

            System.out.println("Diga o mês em que você nasceu: ");
            int m = ent.nextInt();

            System.out.println("Diga o ano em que você nasceu: ");
            int a = ent.nextInt();

            if(d > 0 && d <=31 && m > 0 && m < 12 && a <= 2023){
                System.out.println("Data válida");
            }
            else{
                System.out.println("Data inválida");
            }
    }
        }
}
