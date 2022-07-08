package aula07;

/**
 * Lutador
 */
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;  // os atributos com os mesmo tipo pode ser declarados como um unico atributo
   

    // metodo contrutor da classe Lutador
    public Lutador(String aNome, String aNacionalidade, int aIdade, float aAltura, float aPeso, int aVitorias,
            int aDerrotas, int aEmpates) {
        this.nome = aNome;
        this.nacionalidade = aNacionalidade;
        this.idade = aIdade;
        this.altura = aAltura;
        this.setPeso(aPeso);
        this.vitorias = aVitorias;
        this.derrotas = aDerrotas;
        this.empates = aEmpates;
    }

    // metodos get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String aNome) {
        this.nome = aNome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;

    }

    private void setCategoria(){
        if(this.peso < 65.5f){
           this.categoria = "Inválido";
        }else if(this.peso <= 70.5f){
            this.categoria = "leve";
        }else if(this.peso <= 93.9f){
            this.categoria = "medio";
        }else if(this.peso <= 150.9f){
            this.categoria = "pessado";
         }else{
            this.categoria = "Ivalida";
         }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    // fim do get e set


    public void apresentando() {
        System.out.println("\n\n------------ A Presentando o lutador ---------------------");
        System.out.println("Apresentando o lutador e seu card !!!");
        System.out.println("seu nome é : " + getNome());
        System.out.println("sua nacionalidade é : " + getNacionalidade());
        System.out.println("Pesando exato !! " + getPeso() + " kg");
        System.out.println("Sua cayegiria é : " + getCategoria());
        System.out.println("Altura exata : " + getAltura() + " m");
        System.out.println("Conta com  " + getVitorias() + " vitoria no card principal");
        System.out.println("com " + getEmpates() + " empates se mantendo uns dos principais lutadores na atualidade");
        System.out.println("tendo sido derrotado " + getDerrotas() + "  vezes durante sua tragetoria ");
        System.out.println("\n------------ Fim da Presentação ---------------------\n");
    }
    public void status() {
        System.out.println("\n\n-------------- Status do lutador-------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Numero de Vitorias: " + this.getVitorias());
        System.out.println("Numero de derrotas é de : " + this.getDerrotas());
        System.out.println("Numero de empates é de : " + this.getEmpates());
        System.out.println("================================================================================================\n");
    }


    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

}