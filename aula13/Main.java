package aula13;

public class Main {
    public static void main(String[] args) {
        
        Video v[] = new Video[6];
        v[0] = new Video("titulo qualquer");
        v[1] = new Video("titulo incomum");
        v[2] = new Video("titulo de bringadeira");
        v[3] = new Video("titulo de sacanagem");
        v[4] = new Video("titulo sei-lá");
        // lista de videos 
        // System.out.println(v[0].toString());



        // criando obejeto gafanhoto
        Gafanhoto g[] = new Gafanhoto[4];
        g[0] = new Gafanhoto("Fulano de tal", 22, "M", "123");
        g[1] = new Gafanhoto("\nCiclano", 22, "F", "321");
        g[2] = new Gafanhoto("\nCoizinha", 22, "F", "senha");
        g[3] = new Gafanhoto("\nComo é mesmo o nome", 22, "M", "login\n");

        // System.out.println(g[0].toString());


        // visualização class agregação
        Visualizacao vs[] = new Visualizacao[4];
        vs[0] = new Visualizacao(g[0], v[4]);
        System.out.println(vs[0].toString());
        vs[0].avaliar(35);

        vs[1] = new Visualizacao(g[0], v[1]);
        vs[1].avaliar(48.5f);
        System.out.println(vs[1].toString());




        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
        // fim do curso, recomendações fazer um sistema que acesse um banco de dados 
    }
}
