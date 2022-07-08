package aula05;
public class Mainpp {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nContribuinte 001");
        ContaBanco p1 = new ContaBanco();
        p1.setNunConta(10101);
        p1.setDono("Eu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtualizado();

        System.out.println("\n\ncontribuinte 002");
        ContaBanco p2 = new ContaBanco();
        p2.setNunConta(20202);
        p2.setDono("Ela");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(150);

        p2.estadoAtualizado();
    }
}
