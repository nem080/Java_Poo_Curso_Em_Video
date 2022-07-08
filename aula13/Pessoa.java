package aula13;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;


    

    public Pessoa(String name, int idade, String sexo) {
        this.nome = name;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    // metodo
    protected void ganhaExp(){
        
    }

    // get e set

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


     // metodo toString
    @Override
    public String toString() {
        return "Pessoa \nNome = " + nome + "\nIdade = " + idade + "\nExperiencia = " + experiencia +"\nSexo = " + sexo + "\n";
    }

    
   
    
}
