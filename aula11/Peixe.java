package aula11;

public class Peixe extends Animal {

    private String corEscama;
    // get e set
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

        // sobre escrita
    @Override
    public void alimentar() {
        System.out.println("comendo substancia");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emiti som ");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    public void soltarBolhas() {
        System.out.println("Peixe soltou bolhas ");
    }
    // atributos

}
