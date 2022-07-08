package aula11;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r =new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Ganguru g = new Ganguru();
        Cachorro cache = new Cachorro();
        Cobra c = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldPeixe gp = new GoldPeixe();
        Arara ar = new Arara();
        


        System.out.println("\n<=========POLIMORFISMO=============>\n");

        System.out.println("mamifero");
        m.setPeso(21.3f);
        m.setCorPelo("azul");    
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println("\nReptil");
        r.alimentar();
        r.emitirSom();

        System.out.println("\nPeixe");
        p.alimentar();
        p.emitirSom();

        System.out.println("\nAve");
        a.emitirSom();
        a.alimentar();

        System.out.println("\nGanguru");
        g.alimentar();
        g.emitirSom();

        System.out.println("\nCachorro");
        cache.alimentar();
        cache.emitirSom();
        cache.locomover();
        System.out.println("\nCobra");
        c.locomover();
        c.emitirSom();
        c.getCorEscama();
        System.out.println("\nTartaruga");
        t.emitirSom();
        t.alimentar();
        t.locomover();

        System.out.println("\nGoldPeixe");
        gp.alimentar();
        gp.getMenbros();
        gp.emitirSom();
        System.out.println("\nArara");
        ar.locomover();
        ar.emitirSom();
        ar.fazerNinho();
    }
}
