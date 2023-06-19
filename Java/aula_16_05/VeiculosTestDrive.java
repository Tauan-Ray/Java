package aula_16_05;

public class VeiculosTestDrive {
    public static void main(String[] args){
        Veiculos c1 = new Veiculos("branco", "Volks", "Fox", 5, 0);
        Veiculos c2 = new Veiculos("Azul", "GM", "Spin", 7, 0);

        c1.setQlitros(30f);
        c2.setQlitros(40f);

        

        System.out.println("Cor: "+c1.getCor());
        System.out.println("Marca: "+c1.getMarca());
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Número de passageiros: "+c1.getNpass());
        System.out.println("Quantidade de litro: "+c1.getQlitros());
        
        System.out.println("");

        System.out.println("Cor: "+c2.getCor());
        System.out.println("Marca: "+c2.getMarca());
        System.out.println("Modelo: "+c2.getModelo());
        System.out.println("Número de passageiros: "+c2.getNpass());
        System.out.println("Quantidade de litro: "+c2.getQlitros());

    }
}
