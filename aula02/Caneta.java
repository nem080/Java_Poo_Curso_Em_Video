package aula02;
//toda class começa com letra maiuscula
public class Caneta { 
    String modelo; 
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Uma caneta " + this.cor + "\n");
        System.out.println("esta tampada a caneta " + this.cor + "\n");
        System.out.println("qual a numeração dessa caneta" + this.ponta + "\n");
        System.out.println("qual sera aquantidade de carga tem essa caneta?" + this.carga + "\n");
        System.out.println("Esta tampada ?" + this.tampada +"\n");
        
    }

    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("\nERRO NÃO PODE RABISCAR\n");
        }else{
            System.out.println("\nestou rabiscando\n");

        }
    }

    void tampar(){
        this.tampada = true;

    }

    void destampar(){
        this.tampada = false;
    }
    
}
