package aula09;

public class Aluno extends Pessoa{
    // Atributos
    private int numeroMatricula;
    private String curso;

     
    // Contrutor 
    //   public Aluno(String aNome, String aSexo, int idade, int aNumeroMatricula, String aCurso ) {
    //     super(aNome, aSexo, idade); //utilizando o super eu chamo o construtor da superclasse ou class pai ou mãe da minha classe assim seja...
    //     this.numeroMatricula = aNumeroMatricula;
    //     this.curso = aCurso;
    // }

    // Metodos
    public void cancMatricula(){
        System.out.println("Matricula cancelada");
    }
    
    
    // Metodo especiais  
    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(int aNumeroMatricula) {
        this.numeroMatricula = aNumeroMatricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String aCurso) {
        this.curso = aCurso;
    }

    public void status(){
        System.out.println("\n\nDados do Aluno;");
        System.out.println("Nome: " + this.getNome() + "\nSexo " + this.getSexo() + "\nIdade: " + this.getIdade() + "\nNumero Matricula: " + this.getNumeroMatricula() + "\nCurso: " + this.getCurso()+  "\nSituação Matricula: "+"\n");
    }

    @Override
    public void fazAniversario() {
        super.fazAniversario(); //chamo o metodo da superclasse
       
    }
        
}
