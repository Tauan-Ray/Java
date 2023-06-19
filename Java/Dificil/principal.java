package Dificil;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        try (Scanner ent = new Scanner(System.in)){
            produto p = new produto();

            System.out.println("Digite o preço de custo do produto: ");
            Double precoCusto = ent.nextDouble();
            p.setprecoCusto(precoCusto);
            double custo = p.getprecoCusto();
    

            System.out.println("Digite o preço de venda do produto: ");
            Double precoVenda = ent.nextDouble();
            p.setprecoVenda(precoVenda);
            double venda = p.getPrecoVenda();
    

            p.setNome("Tauan");
            String nome = p.getNome();
            

            System.out.println("-----------------------");
            System.out.println("Nome: "+nome);
            System.out.println("Preço de custo: "+custo);
            System.out.println("Preço de venda: "+venda);
            System.out.println("Margem de lucro:R$"+p.calcularMargemLucro());
            System.out.println("Margem de lucro percentual: "+p.getMargemLucroPorcentagem()+"%");
        }
    }
}
