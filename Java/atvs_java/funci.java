package atvs_java;

public class funci {
    String vendedor ; 
    Float salarioF ;
    Float salarioT ;
    Float Tdevendas ;

    public void info() {
        System.out.println("Nome:"+vendedor);
        System.out.println("Salário fixo:"+salarioF);
        System.out.println("Total de vendas:"+Tdevendas);
    }

    public Double reaj(){
        Double salarioT = (Tdevendas*0.15)+salarioF ;
        return salarioT;
    }


}
