package aula1506;

public class Principal {
    public static void main(String[] args) {
        Garcom g = new Garcom(200);
        Gerente ge = new Gerente();

        g.setSalario(1000);
        ge.setSalario(2000);
        ge.setAumento(1000);
        System.out.println("Garçom: "+g.getBonificacao());
        System.out.println("Gerente: "+ge.getBonificacao());
    }
}
