package aula_30_03;
import java.util.Scanner;

public class gerente {
    String nome;
    String endereco;
    int idade;
    Float salario;
    Scanner ent = new Scanner(System.in);

    public void sal1(){
        float saln = (10*100/salario);
        float saln1 = (salario+saln);
        System.out.println("Seu salário é de: "+saln1);
    }

    public void sal2(){
        System.out.println("Diga o a porcentagem do seu aumento");
        float por = ent.nextFloat();
        float saln = (por*100/salario);
        float saln1 = (salario+saln);
        System.out.println("Seu salário é de: "+saln1);
    } 

    public void gerentee(){
        System.out.println("Diga o seu nome: ");
        nome = ent.nextLine();
        System.out.println("Diga o seu endereço:");
        endereco = ent.nextLine();
        System.out.println("Diga a sua idade:");
        idade = ent.nextInt();
        System.out.println("Diga o seu salário:");
        salario = ent.nextFloat();
        System.out.println("*******************");
     
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
    }
}
