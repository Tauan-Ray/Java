package aula_13_03;

public class prontuario {

    // Propriedades da classe
    String nome;
    String dataNasc;
    Float altura;
    Float peso;
    Float imc;

    public void mostraInfoPaciente() {
        System.out.println("*****INFORMAÇÕES DO PACIENTE*****");
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public float mostraImc() {
        float imc = peso / (altura * altura);
        return imc;
    }

    public void preDiagnosticar(){
        if(mostraImc()<18.5){
            System.out.println("Você está abaixo do peso");
        }
    }
}