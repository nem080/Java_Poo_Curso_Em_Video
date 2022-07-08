package aula13;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views =0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

//    get e set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nvAvaliação;
        nvAvaliação = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = avaliacao = nvAvaliação;
    }

  
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // sobreEscrita class interface
    @Override
    public void play() {
        this.reproduzindo = true;
    }


    @Override
    public void pause() {
        this.reproduzindo = false;
    }


    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public void desLike() {
        this.curtidas --;
    }

    @Override
    public String toString() {
        return "\nVideo \nTitulo = " + titulo + "\nCurtidas = " + curtidas + "\nReproduzindo = " + reproduzindo
                + "\nAvaliação = " + avaliacao + "\nViews = " + views + "\n";
    }

    public int getTotAssistido() {
        return 0;
    }

    
    

}

