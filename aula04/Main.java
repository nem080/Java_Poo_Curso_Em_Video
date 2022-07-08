package aula04;

public class Main {
    public static void main(String[] args) {
        
// retire comentario para rodar o programa 
        // Caneta04 c4 = new Caneta04();
        // c4.setModelo("Bic");
        // //c4.modelo = "Bic";
        // // ponta so pode ser acessada devido ao setPonta  acessando diretamente dara erro por ser privado .
        // c4.setPonta(05f); 
        // //c4.ponta = 05f; -> acessando diretamente porem em atributos privado dara erro por ser privado
        // c4.status();

        // utilizando contrutor
        System.out.println("caneta 1");
        Caneta04 c4 = new Caneta04("canetaco", "verde", 0.5f);
        
        c4.status();
        
        System.out.println("caneta 2");
        Caneta04 c04 = new Caneta04("outra caneta", "vermelha", 1.9f);

        c04.status();
    }
    
}
