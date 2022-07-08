package aula09;

public class Funcionario extends Pessoa{
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Contrutor 
    // public Funcionario(String aNome, String aSexo, int aIdade, String aSetor, boolean aTrabalhando) {
    //     super(aNome, aSexo, aIdade); //utilizando o super eu chamo o construtor da superclasse ou class pai ou mãe da minha classe assim seja...
    //     this.setor = aSetor;
    //     this.trabalhando = aTrabalhando;
    // }
    // Metodos get
    public String getSetor() {
        return setor;
    }
    public void setSetor(String aSetor) {
        this.setor = aSetor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // metodos
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

}
