package aula09;



public class Main09 {
    public static void main(String[] args) {
     Pessoa p1 = new Pessoa();
     Aluno p2 = new Aluno();
     Professor p3 = new Professor();
     Funcionario p4 = new Funcionario();
      
     p1.setNome("João");
     p2.setNome("tayune");
     p3.setNome("Maria");
     p4.setNome("Nikolly");

     p1.setSexo("feminino");
     p4.setSexo("Masculino");
     p2.setIdade(34);

     p2.setCurso("Sistemas de Informação");
     p3.setSalario(300);
     p4.setSetor("TI");

    //  p1.receberAumento(100); // esse metodo esta na class Professor por conta disso gerou erro de compilação
    //  p2.mudarTrabalho(); //  esse metodo esta na class Funcionario por conta disso gerou erro de compilação
    //  p4.cancelarMatrcula(); //  esse metodo esta na class Aluno por conta disso gerou erro de compilação


     System.out.print("\n"+p1.toString()+ "\n" );
     System.out.print(p2.toString()+ "\n" );
     System.out.print(p3.toString()+ "\n" );
     System.out.print(p4.toString()+ "\n\n" );
     
  
    }      
}
