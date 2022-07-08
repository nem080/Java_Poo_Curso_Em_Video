package aula10;

public class Tecnico extends Aluno{
    private int registroProfficional;


    // metodos
    public void praticar(){
        
    }

    // metodos get set 
    public int getRegistroProfficional() {
        return registroProfficional;
    }
    public void setRegistroProfficional(int registroProfficional) {
        this.registroProfficional = registroProfficional;
    }

    // metodos sobre-escrito
    @Override
    public String getCurso() {
        return super.getCurso();
    }

    @Override
    public int getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
    }

    @Override
    public void setCurso(String curso) {
        super.setCurso(curso);
    }

    @Override
    public void setMatricula(int matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

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
    
}
