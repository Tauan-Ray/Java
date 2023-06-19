package Calc;

public class Principal {
    public static void main(String[] args) {
        Calculadoracientifica c = new Calculadoracientifica();
            System.out.println(c.soma(12, 2));
            System.out.println(c.subtracao(12, 2));
            System.out.println(c.multiplicaao(12, 2));
            System.out.println(c.divisao(12, 2));
            System.out.println(c.potencia(2, 3));
            System.out.println(c.raizQuadrada(81));
    }
}
