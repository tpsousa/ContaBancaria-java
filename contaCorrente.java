


class contaCorrente extends ContaBancaria {
    private String name;
    private int numero;

    public contaCorrente(String name, int agencia,String contaCorrente,double saldo,int numero) {
        super(name, agencia, contaCorrente, saldo);
        this.name = name;
        this.numero = numero;
    }
    
    
    @Override
    public String getName(){
        return name;
    }

    @Override
    public String setName(String name){
      return this.name = name;
    }

    public int getNumero(){
        return numero;
    }
    public int setNumero(int numero){
        return this.numero = numero;
    }


    
}