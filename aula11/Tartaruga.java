package aula11;

public class Tartaruga extends Reptil{

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }

    @Override
    public String getCorEscama() {
        return super.getCorEscama();
    }

    @Override
    public void locomover() {
        System.out.println("Bem de vagar");
    }

    @Override
    public void setCorEscama(String corEscama) {
        System.out.println("Casco");
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
