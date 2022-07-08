package aula06;

public class Aula6Main {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();
        controle1.ligar();
        //controle1.maisVolume();
        controle1.menosVolume();
        controle1.play();
        controle1.pause();
        //controle1.ligarMudo();
        controle1.abrirMenu();
        controle1.fecharMenu();
       
    }
}