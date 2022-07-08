package aula12;

public class Main {
    public static void main(String[] args) {
        
        // Animal an = new Animal(); animal não pode ser extanciado pelo fato de ser uma class abstrata 

        System.out.println("<==== Polimorfismo SobreEscrita =====>");
        Mamifero m = new Mamifero();
        System.out.println("\nMamifero");
        m.emitirSom();
        m.getCorPelo();

        System.out.println("Esse é um cachorro");
        Cachorro c = new Cachorro();
        c.emitirSom();

        System.out.println("Esse é Lobo");
        Lobo l = new Lobo();
        l.emitirSom();

        System.out.println("\n<==== Polimorfismo SobreCarga =====>\nCachorro\n");
        c.reagir("Olá");
        c.reagir("vai apanhar");
        c.reagir(11, 45);
        c.reagir(22, 10);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);


    }
}
