package aula11;

public class Ave extends Animal{
    private String corPena;


    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Ave voa");
    }

    @Override
    public void alimentar() {
        System.out.println("Come inseto");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave pia");
    }

    public void fazerNinho(){
        System.out.println("Construiu ninho");
    }
    
}
