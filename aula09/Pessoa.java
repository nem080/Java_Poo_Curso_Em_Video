package aula09;

public class Pessoa {
    // Atributos 
    private String nome, sexo;
    private int idade;
    
    // Contrutor 
    // public Pessoa(String aNome, String aSexo, int aIdade) {
    //     this.nome = aNome;
    //     this.idade = aIdade;
    //     this.sexo = aSexo;
    // }
    // metodos especiais get e set
    // get sempre tem que descrever o tipo na construção ex; public "void" getNome, substituir o void por um string.
    public String getNome(){
        return this.nome;
    }
    //set tem que efetuar a declaração do tipo e o atributo ex; public void setNome(String n)  "String n" , é a declaração
    public void setNome(String aNome){
        this.nome = aNome;
    }

    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String aSexo) {
        this.sexo = aSexo;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int aIdade){
        this.idade = aIdade;
    }

    // metodos
    public void fazAniversario(){
        this.idade ++;
    }
    
    @Override
    public String toString(){
        return "[Nome: " + this.nome + ",  Idade: " + this.idade + ",  Sexo: " + this.sexo + "]";
    }
}
