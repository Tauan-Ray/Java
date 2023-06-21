package aula1506;

public class Gerente extends Funcionario{
    private int aumento;

    @Override
    public double getBonificacao() {
        return this.getSalario() + aumento; 
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }

    
}
