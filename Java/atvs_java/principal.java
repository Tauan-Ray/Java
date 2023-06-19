package atvs_java;

import java.util.Scanner;

public class principal {
    public static void main(String[]args) {
        try (Scanner prin = new Scanner(System.in)){
            funci p = new funci();

            System.out.println("Qual seu nome?");
            p.vendedor = prin.nextLine();
            System.out.println("Qual seu salário fixo?");
            p.salarioF = prin.nextFloat();    
            System.out.println("Qual foi o total de vendas?");
            p.Tdevendas = prin.nextFloat();
            System.out.println("=============================");

            p.info();
            System.out.println("Salario final: " +p.reaj());
        }
        
    }
    
}
