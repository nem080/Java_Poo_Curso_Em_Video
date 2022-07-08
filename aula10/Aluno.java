package aula10;
// privado matricula: Inteiro
// privado curso: Caractere
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    // metodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno..." + this.getNome()+"\n");
    }

    // get e set
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
