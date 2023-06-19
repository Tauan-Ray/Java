public class TestesAnimais {
    public static void main(String[] args){

        Mamiferos mamiferos = new Mamiferos("Camelo", "Marrom", "Deserto", 2.25 , 65, 4, "Ramos");
        System.out.println("========================");
        mamiferos.dados();
        System.out.println("========================");

        Peixe peixe = new Peixe("Tubarão", null, null, 20, 19, 0, null);
        peixe.dados();
        System.out.println("========================");


        mamiferos.alteraNome("Urso-do-Canadá");
        mamiferos.alteraComprimento(2.80);
        mamiferos.alteraCor("Castanho");
        mamiferos.alteraVelocidade(56);
        mamiferos.alteraAlimento("Mel");
        mamiferos.dados();
        System.out.println("========================");
        
        peixe.alteraNome("Truta");
        peixe.alteraComprimento(0.7);
        peixe.alteraCor("Marrom");
        peixe.alteraVelocidade(72);
        peixe.dados();
        System.out.println("========================");
    }
}
