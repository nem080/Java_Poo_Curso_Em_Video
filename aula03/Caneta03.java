package aula03;

public class Caneta03 {
// Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

// estatus para imprimir no main
    public void status(){
        System.out.println("\nqual é o modelo da caneta ? " + this.modelo +"\n");
        System.out.println("Uma caneta " + this.cor + "\n");
        System.out.println("esta tampada a caneta " + this.cor + "\n");
        System.out.println("qual a numeração dessa caneta" + this.ponta + "\n");
        System.out.println("qual sera aquantidade de carga tem essa caneta?  " + this.carga + "\n");
        System.out.println("Esta tampada ? " + this.tampada +"\n");
    }
        // metodo
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("\nERRO NÃO PODE RABISCAR\n");
        }else{
            System.out.println("\nestou rabiscando\n");

        }
    }
// QUANDO UTILIZA O PUBLIC DECLARANDO O "THIS.TAMPADA" O CONTEXTO MUDA, PODENDO MEXER SOMENTE DENTRO DA CLASSE AONDE   ESTA PRIVADO.
   public void tampar(){
        this.tampada = true;

    }
// QUANDO UTILIZA O PUBLIC DECLARANDO O "THIS.TAMPADA" O CONTEXTO MUDA, PODENDO MEXER SOMENTE DENTRO DA CLASSE AONDE   ESTA PRIVADO.
    public void destampar(){
        this.tampada = false;
    }

}
