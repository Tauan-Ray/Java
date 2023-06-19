package dificilL;

public class produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;   
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    public double getPrecoCusto() {
        return this.precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
            
    }
    public double getPrecoVenda() {
        return this.precoVenda;
    }
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
        
    }
    public double getMargemLucro() {
        return this.margemLucro;
        
    }

    public double calcularMargemLucro() {
        double margemLucro = this.precoVenda-this.precoCusto;
        return margemLucro;
    }

    public double getMargemLucroPercentual() {
        double margemLucro = this.precoVenda - this.precoCusto;
        double margemLucroPercentual = (margemLucro/this.precoCusto) * 100;
        return margemLucroPercentual;
    }
    

}
