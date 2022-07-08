package aula11;

public class Reptil extends Animal{
    // atributos
    private String corEscama;

    // get set
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    // sobre escrita 
    @Override
    public void locomover() {
        System.out.println("Reptil rasteja ");
    }

    @Override
    public void alimentar() {
        System.out.println("come vegetais ");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil ");
    }
    
    
}
