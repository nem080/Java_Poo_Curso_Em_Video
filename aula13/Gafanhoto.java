package aula13;

public class Gafanhoto extends Pessoa{

    public String login;
    public int totAssistido;

     // contructor da class pessoa super class 
     public Gafanhoto(String name, int idade, String sexo, String login) {
        super(name, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    
    // metodos simples 
    public void viuMaisUm(){
        this.totAssistido ++;
    }

    // get e set da classs Pessoa 
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }


    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
     public String getSexo() {
        return sexo;
     }
     public void setSexo(String sexo) {
        this.sexo = sexo;
     }

     public float getExperiencia(){
        return experiencia;
     }

     public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
     }


    @Override
    public String toString() {
        return "Gafanhoto"+super.toString() + "\nlogin = " + login + "\ntotAssistido = " + totAssistido + "]";
    }
}
