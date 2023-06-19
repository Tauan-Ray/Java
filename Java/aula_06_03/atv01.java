package aula_06_03;

import java.util.Scanner;

public class atv01 {
    public static void main(String[] args){
        try (Scanner ent = new Scanner(System.in)){

        
        System.out.println("Informe a senha: ");
        int s = ent.nextInt();
        if (s == 1234){
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Acesso negado");
        }
    }
}
}
