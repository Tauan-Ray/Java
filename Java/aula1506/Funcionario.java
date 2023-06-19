package aula1506;

public abstract class Funcionario{
    private double salario;

    public double getBonificacao(){
        return salario *1.2;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}