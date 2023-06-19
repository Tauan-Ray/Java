package aula1506;

public class Gerente extends Funcionario{
    private int aumento = 1500;

    @Override
    public double getBonificacao() {
        return this.getBonificacao() + aumento; 
    }

    
}
