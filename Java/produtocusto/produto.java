package produtocusto;

public class produto {
    private String nome;
    private Double precoCusto;
    private Double precoVenda;
    private Double margemLucro;

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setprecoCusto(double novoPrecoCusto){
        this.precoCusto = novoPrecoCusto;
    }

    public Double getprecoCusto(){
        return this.precoCusto;
    }

    public void setprecoVenda(double novoPrecoVenda){
        if (novoPrecoVenda < this.precoCusto){
            System.out.println("O preço de venda é inferior ao preço de custo");
            this.precoVenda = novoPrecoVenda;
        }

        else{
            this.precoVenda = novoPrecoVenda;
        }
    }

    public Double getPrecoVenda(){
        return this.precoVenda;
    }


    public void setmargemLucro(double novoMargemLucro){
        this.margemLucro = novoMargemLucro;
    }

    public Double getMargemLucro(){
        return this.margemLucro;
    }

    public Double calcularMargemLucro(){
        return this.precoVenda - this.precoCusto;
    }

    public double getMargemLucroPorcentagem(){
        double margemLucro = this.precoVenda - this.precoCusto;
        double margemLucroPercentual = (margemLucro/this.precoCusto) * 100;
        return margemLucroPercentual;
    }

}
