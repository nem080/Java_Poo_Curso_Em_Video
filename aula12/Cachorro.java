package aula12;

public class Cachorro extends Lobo{

    public void reagir(String frase){
        if (frase == "toma comida" || frase == "Olá") {
            System.out.println("Cachorro Abanando o rabo e latindo\n");
        }else{
            System.out.println("Rosnar bravo");
        }
    }

    public void reagir(int horas , int min){
        if (horas < 12) {
            System.out.println("Abanar o rabo\n");
        }if (horas >= 18) {
            System.out.println("Sendo ignorado pelo cachorro\n");
        } else {
            System.out.println("Abanar o rabo e latir querendo brincar todo faceiro \n");
            this.emitirSom();
        }
    }

    public void reagir(boolean dono){
        if ( dono == true ) {
            System.out.println("Abanando o rabo quando vê o dono\n ");
        }else{
            System.out.println("Rosnar e latir au! au! au!");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso){
        if (idade <= 4 ) 
            if(peso <= 12){
            System.out.println("Cachorro novo, cheio de energia\n");
        }else{
            System.out.println("Cachorro velho e sonolento\n");
        }else{
            if(peso <= 10){
                System.out.println("Cachorro rosnando\n");
            }else{
                System.out.println("Cachorro ignorando o dono ");
            }
        }
    }
    // sobre escrita do metodo da class animal super class
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au! Au! Arrrrrrrrrrr\n");
    }
    
}
