package aula05;

public class ContaBanco {
    //atributos da classe
    public int nunConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //metodos especiais 
    //Contrutor 
    public void ContaBanco() {
        this.saldo = 0;
        this.status = false;

    }

    //metodos personalizados.
    public void estadoAtualizado() {
        System.out.println("Conta: " + this.getNunConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo R$: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void  abrirConta(String t) {
        this.setTipo (t);
        this.setStatus (true);
        if (t == "CC") {
            this.setSaldo (50);
        } else if (t == "CP"){
            this.setSaldo (150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    public void  fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Impossivel fechar a conta consta dinheiro ");
        }else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada por conter saldo negativo.");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso!!");
        }
    }
    public void  depositar(float v) {
        if (this.getStatus() == true) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado com sucesso na conta " + this.getDono());
        }else{
            System.out.println("impossivel depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso da conta " + this.getDono());
            }else{
                System.out.println("saldo insuficiente para saque ");
            }

        }else{
            System.out.println("Impossivel sacar de uma conta fechada ");
        }
    }


    public void pagarMensalidades() {
        int v = 0;
        if (this.getTipo()== "CC") {
            v = 12;
        } else if(this.getTipo()== "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()- v);
            System.out.println("mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("impossivel pagar uma conta fechada");
        }
    }

    
    
    // metodos get e set
    // get sempre tem que descrever o tipo na construção ex; public "void" getNome, substituir o void por um string. 
    public int getNunConta() {
        return this.nunConta;
     }
     //set tem que efetuar a declaraão do tipo e o atributo ex; public void setNunConta(int n)  "int n" , é a declaração
    public void setNunConta(int n) {
        this.nunConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono(){
        return this. dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }



}
 
/*
    private boolean status;
*/