package aula1506;

public class Garcom extends Funcionario{
    private double comissao;

    public Garcom(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double getBonificacao() {
        return this.getSalario() + comissao; 
    }
}
