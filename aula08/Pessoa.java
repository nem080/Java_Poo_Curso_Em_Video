package aula08;
public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;

    // construtor 
    public Pessoa(String aNome, int aIdade, String aSexo){
        this.nome = aNome;
        this.idade = aIdade;
        this.sexo = aSexo;
    }

    // get e set
    public String getNome(){
        return nome;
    }
    public void setNome(String aNome){
        this.nome = aNome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int aIdade){
        this.idade = aIdade;
    }

    public String getSexo(){
        return sexo;
    }   
    public void setSexo(String aSexo){
        this.sexo = aSexo;
    }

    // metodos 
    public void fazerAniversario(){
        this.idade++; // incrementa idade, mesma coisa que this.idade = this.idade + 1
    }

    
}
