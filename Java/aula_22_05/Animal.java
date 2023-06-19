package aula_22_05;

public class Animal{
    String nome;
    int comprimento;
    int nPatas;
    String cor;
    String ambiente;
    float velocidade;


    public Animal(String n, int c, int nP, String cor, String a, float v) {
        this.setNome(n);
        this.setComprimento(c);
        this.setnPatas(nP);
        this.setCor(cor);
        this.setAmbiente(a);
        this.setVelocidade(v);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int c) {
        this.comprimento = c;
    }
    public int getnPatas() {
        return nPatas;
    }
    public void setnPatas(int nP) {
        this.nPatas = nP;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String a) {
        this.ambiente = a;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float v) {
        this.velocidade = v;
    }

    public void alteraNome(){
        this.setNome(nome);
    }

    public void alteraComprimento(){
        this.setComprimento(comprimento);
    }

    public void alteraPatas(){
        this.setnPatas(nPatas);
    }

    public void alteraCor(){
        this.setCor(cor);
    }

    public void alteraAmbiente(){
        this.setAmbiente(ambiente);
    }

    public void alteraVelocidade(){
        this.setVelocidade(velocidade);
    }

    public void dados(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Comprimento: "+this.getComprimento());
        System.out.println("Número de patas: "+this.getnPatas());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ambiente: "+this.getAmbiente());
        System.out.println("Velocidade: "+this.getVelocidade());
    }

}
