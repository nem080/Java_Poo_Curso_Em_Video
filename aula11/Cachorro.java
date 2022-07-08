package aula11;

public class Cachorro extends Mamifero{

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
       System.out.println("Latidos");
    }

    @Override
    public String getCorPelo() {
        return super.getCorPelo();
    }

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void setCorPelo(String corPelo) {
        super.setCorPelo(corPelo);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public int getMenbros() {
        return super.getMenbros();
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setMenbros(int menbros) {
        super.setMenbros(menbros);
    }

    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }

    
}
