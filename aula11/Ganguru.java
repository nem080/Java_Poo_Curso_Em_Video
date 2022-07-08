package aula11;

public class Ganguru extends Mamifero {

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }

    @Override
    public String getCorPelo() {
        return super.getCorPelo();
    }

    @Override
    public void locomover() {
       System.out.println("Saltando ");
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
    public void usarBolsa(){
        System.out.println("usando a sua bolsa");
    }
    
}
