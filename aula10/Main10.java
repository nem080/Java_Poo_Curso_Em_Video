package aula10;

public class Main10 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();

        // Visitante v1 = new Visitante();
        // v1.setNome(" Visitante thola");
        // v1.setIdade(21);
        // v1.setSexo("M");
        // System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        System.out.println("Aluno");
        a1.setNome(" Aluno joao");
        a1.setIdade(45);
        a1.setMatricula(112233);
        a1.setCurso("Java");
        a1.setSexo("F");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        System.out.println("Bolsista");
        b1.setNome("thor");
        b1.setBolsa(6.8f);
        b1.setSexo("I");
        b1.setMatricula(24359);
        b1.pagarMensalidade();
        b1.renovarBolsar();

    }
}
