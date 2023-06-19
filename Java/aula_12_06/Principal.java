package aula_12_06;

public class Principal {
    public static void main(String[] args) {
        Exemplo e1 = new Exemplo();
        Exemplo e2 = new Exemplo();

        System.out.println("Valor de e1:");
        System.out.println("i: "+e1.i);
        System.out.println("j: "+e1.j);
        System.out.println("Valor de e2:");
        System.out.println("i: "+e2.i);
        System.out.println("j: "+e2.j);

        e1.i = 48;
        e1.j = 27;
        System.out.println("****ALTERANDO VALORES****");

        System.out.println("Valor de e1:");
        System.out.println("i: "+e1.i);
        System.out.println("j: "+e1.j);
        System.out.println("Valor de e2:");
        System.out.println("i: "+e2.i);
        System.out.println("j: "+e2.j);

        System.out.println("PI: "+Math.PI);

    }
}
