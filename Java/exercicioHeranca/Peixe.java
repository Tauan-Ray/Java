public class Peixe extends Animais{

    private String caracteristicas;

    public Peixe(String n, String cor, String a, double c, float v, int p, String caracteristicas) {
        super(n, c, p, cor, a, v);
        this.setCaracteristicas("Barbatanas e cauda");
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
    }


    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void alteraCaracteristicas(String c){
        this.setCaracteristicas(c);
    }

    public String caracteristicas(){
        return this.getCaracteristicas();
    }

    @Override
    public void dados(){
        super.dados();
        System.out.println("Características: "+this.getCaracteristicas());
    }
    
    
}
