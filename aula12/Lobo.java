package aula12;

public class Lobo extends Mamifero{

    @Override
    public void emitirSom() {
        System.out.println("esse som é do Animal");
        super.emitirSom();
        System.out.println("Esse som é do lobo Auuuuuuuuuuuuuuuuuuuuuuuuuuu!\n");
    }

    
}
