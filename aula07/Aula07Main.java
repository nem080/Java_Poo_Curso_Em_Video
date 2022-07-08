package aula07;



public class Aula07Main {
    public static void main(String[] args) {
       // modo convencional para instaciar um objto
        // Lutador l1 = new Lutador("robert", "Brasil", 43, 1.95f, 93, 18, 1, 19);
        // l1.status();

        // criando vetor 
        Lutador l [] = new Lutador[6];
        //l0, l1 sào da mesma categoria
        l[0]= new Lutador("Lionel Messi", "Argentina", 34, 1.60f, 74.6f, 30, 1, 10);
        l[1]= new Lutador("Cristiano Ronaldo", "Portugal", 38, 1.90f, 87.6f, 190, 20, 11);
        //l2, l3 são da mesma categoria
        l[2]= new Lutador("Neymar JN", "Brasil", 33, 1.78f, 68.9f, 260, 0, 0);
        l[3]= new Lutador("Edson Arantes do nacimento", "Brasil", 89, 1.80f, 70f, 1000, 0, 1);
        //l4, l5 são da mesma categoria
        l[4]= new Lutador("Diego Maradona", "Argentino", 59, 1.58f, 142.7f, 0, 200, 1);
        l[5]= new Lutador("Sergio Ramos", "Espanha", 37, 1.96f, 145f, 5, 1, 0);

        
       
        // criando um objeto da classe Luta
        Luta uec01 = new Luta();
        uec01.marcarLuta(l[0], l[1]);
        uec01.combater();

        l[0].getVitorias();
        l[0].status();
        
        l[1].getVitorias();
        l[1].status();
    
    }
}
