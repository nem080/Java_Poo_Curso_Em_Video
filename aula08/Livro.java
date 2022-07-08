package aula08;
// titulo, autor, totPaginas, pagAtual, aberto, leitor
// detalhes ()
public class Livro implements Publicacao {
    private String titulo;
    private String  autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // construtor 
    public Livro(String aTitulo, String aAutor, int aTotPaginas, Pessoa aLeitor){
        this.titulo = aTitulo;
        this.autor = aAutor;
        this.totPaginas = aTotPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = aLeitor;
    }
    
    // get e set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // metodos
    public String detalhes() {
        return "\nDetalhe Do Livro [" + "titulo = " + titulo + "\nAutor = " + autor + "\nTotal Paginas = " + totPaginas + "\nPagina Atual = " + pagAtual + "\nAberto = " + aberto + "\nPessoa = " + leitor.getNome() +  " Pessoa = " + leitor.getIdade() + " Pessoa = " + leitor.getSexo() +"]\n"; //retirando o getNome do Leito o toString pega a referncia do objeto não apresentando o nome do leito e sim um numero de referncia do objeto.
    }
    
    // metodos de publicacao
    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Você fechou o livro ate logo");
        
    }

    @Override
    public void folhear(int aPag) {
       
       if(aPag > totPaginas){
           this.totPaginas = 0;
       }else{
            this.pagAtual = aPag;
       }
    }

    @Override
    public void avancarPag() {
        System.out.println("Você avançou uma pagina" + this.pagAtual++);
    }

    @Override
    public void voltarPag() {
        System.out.println("Você voltou uma pagina" + this.pagAtual--);
    }

}
