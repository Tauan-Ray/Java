package aula_06_03;
import java.util.Scanner;

public class atv05 {
    public static void main(String[] args){
        try (Scanner ent = new Scanner(System.in)){
            System.out.println("Diga a medida do primeiro lado do triângulo: ");
            float l1 = ent.nextFloat();

            System.out.println("Diga a medida do segundo lado do triângulo: ");
            float l2 = ent.nextFloat();

            System.out.println("Diga a medida do terceiro lado do triângulo: ");
            float l3 = ent.nextFloat();

            if(l1==l2 && l2 == l3){
				System.out.println("O triângulo é Eqüilátero.");
			}
            else if(l1==l2 || l1==l3 || l2==l3){
				System.out.println("O triângulo é Isósceles.");
			}
            else{
				System.out.println("O triângulo é Escaleno.");
			}

        }
    }
}
