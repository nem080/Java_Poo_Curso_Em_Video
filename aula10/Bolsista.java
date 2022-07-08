package aula10;

public class Bolsista extends Aluno{
    private float bolsa;

    // metodos
    public void renovarBolsar(){
        System.out.println("Renovando a bolso do bolsista " + getNome()+ "\n");
    }
    //sobre escrevendo
    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
    }

    // get e set
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float string) {
        this.bolsa = string;
    }




    

}
