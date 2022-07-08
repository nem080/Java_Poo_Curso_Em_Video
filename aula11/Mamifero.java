package aula11;

public class Mamifero extends Animal {
    // atributos

   private String corPelo;

    //    metodos get e set 
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    // sobre-escrita da class mae 
    @Override
    public void locomover() {
        System.out.println("\nMamifero corre ");
    }

    @Override
    public void alimentar() {
         System.out.println("mamando ");
    }

    @Override
    public void emitirSom() {
          System.out.println("Som de mamifero");
    }
    // ==========================

}
