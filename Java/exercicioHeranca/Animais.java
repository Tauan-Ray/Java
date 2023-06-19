public class Animais {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animais(String nome, double comprimento, int patas, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double c) {
        this.comprimento = c;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int p) {
        this.patas = p;
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

    public void alteraNome(String nome){
        this.setNome(nome);
    }

    public void alteraComprimento(Double comprimento){
        this.setComprimento(comprimento);
    }

    public void alteraPatas(int patas){
        this.setPatas(patas);
    }

    public void alteraCor(String cor){
        this.setCor(cor);
    }

    public void alteraAmbiente(String ambiente){
        this.setAmbiente(ambiente);
    }

    public void alteraVelocidade(float velocidade){
        this.setVelocidade(velocidade);
    }

    public void dados(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Comprimento: "+this.getComprimento()+" m");
        System.out.println("Patas: "+this.getPatas());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ambiente: "+this.getAmbiente());
        System.out.println("Velocidade: "+this.getVelocidade()+" km/h");
    }

}
