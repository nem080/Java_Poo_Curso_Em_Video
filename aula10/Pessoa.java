package aula10;
// class abstract n!ao pode ser extanciada.
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // metodos final Um método ser final significa que você não pode sobrepô-lo. Uma classe ser final significa que você não pode estendê-la, ou seja: não pode criar uma subclasse(classe filha) dela.

    public final void fazerAnivev(){ //metodo não pode ser extendida a outra class por ser final.
        this.idade++;
    }

    //get e ser
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "\nPessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]\n";
    }

    
    
}
