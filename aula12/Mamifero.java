package aula12;

public class Mamifero extends Animal{

    protected String corPelo;

    // get e set
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // sobre escrita metodo da class Animal super class 
    @Override
    public void emitirSom() {
        System.out.println("Esse é o som do mamifero\n");
    }
    
}
