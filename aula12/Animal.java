package aula12;

public abstract class  Animal {
    protected float peso;
    protected int idade;
    protected int membro;

    // get e set
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembro() {
        return membro;
    }
    public void setMembro(int membro) {
        this.membro = membro;
    }

    // metodo
    public abstract void emitirSom();


}
