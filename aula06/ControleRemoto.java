package aula06;

public class ControleRemoto implements Interfaces {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    /** metodo contrutor usando this. para acessaar o metodo privado. */
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    /** metodos get e set para acessar os atributos privados */
    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int aVolume) {
        this.volume = aVolume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean aLigado) {
        this.ligado = aLigado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean aTocando) {
        this.tocando = aTocando;
    }
    // fim dos metodos get e set

    /**
     * rescrevendo os metodos da class Interface @Override usando para mostra que
     * esta rescrevendo um metodo
     */
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("\n\n-------MENU-------\n");
        System.out.println("Está tv esta ligada? " + this.getLigado());
        System.out.println("Está tocando ? " + this.getTocando());
        System.out.print("volume da tv ? " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" * ");

        }
        System.out.println("\n");

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume: " + this.getVolume());
        } else {
            System.out.println("Não posso aumentar o volume, a tv esta desligada");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume: " + this.getVolume());
        } else {
            System.out.println("Não posso diminuir o volume, a tv esta desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

}