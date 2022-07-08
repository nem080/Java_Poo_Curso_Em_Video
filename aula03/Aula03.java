package aula03;

public class Aula03 {
    public static void main(String[] args){

        Caneta03 c3 = new Caneta03();
        c3.modelo = "big cristal";
        c3.cor = "Azul";
        //c3.ponta = 0.5f;
        c3.carga = 80;
        //c3.tampada = false;
        c3.destampar();  // olha na class Caneta03
        c3.status();
        c3.rabiscar();
    }
}
