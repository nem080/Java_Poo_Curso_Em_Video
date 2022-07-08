package aula08;

public class Main {
    public static void main(String[] args) {
        Pessoa[] Pessoa = new Pessoa[3];
        Livro[] lv = new Livro[3];
        Pessoa[0] = new Pessoa("Maria", 4, "F");
        Pessoa[1] = new Pessoa("Tayuane", 34, "F");
        
        lv[0] = new Livro("Mundo magico", "So Deus sabe ", 200, Pessoa[0]);
        lv[1] = new Livro("Cod", "fulano de tal", 350, Pessoa[1]);
        lv[2] = new Livro("culinaria", "vovo", 200, Pessoa[0]);

        lv[0].abrir();
        lv[0].folhear(19);
        lv[0].avancarPag();
        lv[0].voltarPag();
        System.out.println(lv[0].detalhes());

    }
}
