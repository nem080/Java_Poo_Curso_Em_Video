package aula04;

public class Caneta04 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
       // metodo construtor sempre tera o nome da classe.
       public Caneta04(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
// utilizando getModelo para chamar a variavel modelo
    public String getModelo() {
        return this.modelo;
    }
// utilizando setModelo para chamar a variavel m
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void cor(){
        
    }

    public void tampar(){
        this.tampada = false;
    }
    public void destampar(){
        this.tampada = true;
    }

    public void status(){
        System.out.println("\nSobre a Caneta");
        System.out.println("\nmodelo da caneta " + this.modelo + "\n");
//imprimindo na tela pelo => get => "System.out.println("\nmodelo da caneta " + this.getModelo() + "\n");"
        System.out.println("ponta "+ this.ponta + "\n");
 //imprimindo na tela pelo => get => "System.out.println("\ponta " + this.getPonta() + "\n");" 
        System.out.println("cor "+ this.cor + "\n");
        System.out.println("tampada "+ this.tampada + "\n");
    }



 
}
