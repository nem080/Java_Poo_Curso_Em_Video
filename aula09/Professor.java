package aula09;

public class Professor extends Pessoa{
    private String especialidade;
    private int salario;

    //Contrutor
    // public Professor(String nome, String sexo, int idade, String especialidade, int salario) {
    //     super(nome, sexo, idade);
    //     this.especialidade = especialidade;
    //     this.salario = salario;
    // }
    // Metodos get
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String aEspecialidade) {
        this.especialidade = aEspecialidade;
    }

    public int getSalario() {
        return salario;
    }   
    public void setSalario(int aSalario) {
        this.salario = aSalario;
    }

    // Metodo
    public void receberAumento(float aument) {
        this.salario += aument;
    }
}
