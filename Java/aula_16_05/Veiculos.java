package aula_16_05;

public class Veiculos {
    String cor;
    String marca;
    String modelo;
    int npass;
    float qlitros;

    public Veiculos(String c, String m, String mo, int np, float ql){
        this.setCor(c);
        this.setMarca(m);
        this.setModelo(mo);
        this.setNpass(np);
        this.setQlitros(ql);
    }

    public void setCor(String c){
        this.cor = c;
    }

    public String getCor(){
        return this.cor;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String mo){
        this.modelo = mo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setNpass(int np){
        this.npass = np; 
    }

    public int getNpass(){
        return this.npass;
    }

    public void setQlitros(Float ql){
        this.qlitros = ql;
    }

    public float getQlitros(){
        return this.qlitros;
    }

}
