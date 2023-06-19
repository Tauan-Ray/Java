package aula_13_03;

public class principal {
    public static void main(String[] args) {
        // *criação de objeto */
        prontuario p = new prontuario();

        System.out.println("*************************");
        p.nome = "Bruna";
        p.dataNasc = "29/12/2006";
        p.altura = 1.68f;
        p.peso = 31f;

        p.mostraInfoPaciente();
        System.out.println(p.mostraImc());
    }

}
