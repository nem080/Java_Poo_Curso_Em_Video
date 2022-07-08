package aula10;
 //visitante considerado heranca pobre pelo fato de não conter nenhum atributo ou metodo, herdando tudo da sua super class que é Pessoa.
public class Visitante extends Pessoa{

    @Override
    public int getIdade() {
        
        return super.getIdade();
    }
    @Override
    public String getNome() {
        
        return super.getNome();
    }

    @Override
    public String getSexo() {
        
        return super.getSexo();
    }
    @Override
    public void setIdade(int idade) {
        
        super.setIdade(idade);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }
    
}
