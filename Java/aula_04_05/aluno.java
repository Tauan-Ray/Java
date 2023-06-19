package aula_04_05;

public class aluno {
    String nome;
    int idade;
    int matricula;
    char sexo;
    String cpf;

    public aluno(){}
    public aluno(String nome, int idade, int matricula, char sexo, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public aluno(String nome, String cpf, int matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public void mostrainfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Matricula: "+matricula);
        System.out.println("Sexo: "+sexo);
        System.out.println("CPF: "+cpf);

    }
}
