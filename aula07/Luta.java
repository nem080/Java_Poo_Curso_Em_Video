package aula07;

import java.util.Random;

public class Luta {
    // atributos
    private  Lutador desafiante;  //usando tipo abstrato de dados de outra class relacionando as class 
    private  Lutador desafiado;  //usando tipo abstrato de dados de outra class relacionando as class 
    private int rounds;
    private boolean aprovado;


    // metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            System.out.println("\n\n[Sera uma grande Luta entre " + l1.getNome() + " e " + l2.getNome() + " se preparece para o espetaculo]\n");
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("\nLuta não acontecera devido a divergencia das informações do lutadores ");
        }
       
    }
    public void combater(){
        if(this.aprovado){
            System.out.println("\n\t<=====DESAFIADO====>  \n\t" + this.desafiado.getNome());
            this.desafiado.apresentando();
            System.out.println("\n\t<=====DESAFIANTE====>  \n\t" + this.desafiante.getNome()+ "\n");
            this.desafiante.apresentando();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2
            switch (vencedor) {
                case 0:
                    System.out.println("<==== EMPATOUUUUU!!!! =====>");
                    System.out.println("\n Foi uma grande luta os participante deram um Show de espetaculo não poderia sair um resultado diferente a luta deu Empate!!!!!!!!!!!\n");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("\n <===== O lutador " + this.desafiado.getNome() + " VENCEU A LUTA =====> \n");
                    System.out.println(" Foi uma grade luta " + this.desafiado.getNome()+ " venceu a luta dando um show de espetaculo, parabens para o seu oponente " + this.desafiante.getNome() + " que so valorizou mais esse espetaculo muito obrigado por vocês estarmos com nosco nessa trasmição, nos vemos nas proximas lutas tchau Brigado!!!!\n");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("\n <====== O lutador " + this.desafiante.getNome() + " VENCEU A LUTA =====> \n");
                System.out.println(" Foi uma grade luta " + this.desafiante.getNome()+ " venceu a luta dando um show de espetaculo, parabens para o seu oponente " + this.desafiado.getNome() + " que so valorizou mais esse espetaculo Muito obrigado pela audiencia nos vemos nas proxima lutas\n");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                }

        }else{
            System.out.println("Luta não acontecera devido a divergencia das informações do lutadores " + this.desafiado.getNome() + " e " + this.desafiante.getNome());
        }
    }

    // metodo get e set 

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

  
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

 
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

   
    public boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
