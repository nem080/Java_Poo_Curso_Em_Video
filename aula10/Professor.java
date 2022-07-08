package aula10;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;


    // metodos  get e set
    public void receberAumento() {
        this.salario = (salario * salario + 1);
    }


    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public float getSalario() {
        return salario;
    }


    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public int getIdade() {
        return super.getIdade();
    }

    // metodos sobre escrito da class pessoa, ou super class.
    @Override
    public String getNome() {
        return super.getNome();
    }


    @Override
    public String getSexo() {
        return super.getSexo();
    }


    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }


    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    
    

    // metodo não pode ser extendido pelo fato de ser final.
    // @Override
    // public void fazerAnivev() {
    //     super.fazerAnivev();
    // }
}
