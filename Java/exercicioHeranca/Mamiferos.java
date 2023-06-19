public class Mamiferos extends Animais{

    private String alimento;

    public Mamiferos(String n, String cor, String a, double c, float v, int p, String alimento) {
        super(n, c, p, cor, a, v);
        this.setAmbiente("Terra");
        this.setAlimento(alimento);
    }

    public String getAlimento() {
        return alimento;
    } 

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento){
        this.setAlimento(alimento);
    }

    public String alimento(){
        return this.getAlimento();
    }

    public void dados(){
        super.dados();
        System.out.println("Alimento: "+this.getAlimento());
    }
    
}
