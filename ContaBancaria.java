
import java.util.Scanner;
public class ContaBancaria{
 //depois dou uma olhada
    private String name;
    private int agencia;
    private String contaCorrente;
    private double saldo;

    public ContaBancaria(String name,int agencia,String contaCorrente, double saldo){
       this.name = name;
       this.agencia= agencia;
       this.contaCorrente = contaCorrente;
       this.saldo = saldo;
    }

     public String setName(String name){
        return this.name = name;
     }

      public String getName(){
        return name;
     }
     public double getSaldo(){
        return saldo;
     }

     public double setSaldo(double saldo){
        return this.saldo = saldo;
     }

     public int getAgencia() {
        return agencia;
     }

     public int setAgencia(int agencia){
       return this.agencia = agencia;
     }

     public String getContaCorrente(){
        return contaCorrente;
     }
     public String setContaCorrente(String contaCorrente){
          return this.contaCorrente = contaCorrente;
     }

     public void Depositar(){
         
         Scanner scanner = new Scanner(System.in);


        int valorDeposito = scanner.nextInt();

        if(valorDeposito > 0){
            this.saldo += valorDeposito;

            System.out.println("o saldo atual da conta e : " + saldo );
        }else{
            System.out.println("deposito invalido,por favor,escolha um numero superior a 0 para depositar");
        }
     }

     public void Sacar(){
        Scanner scanner = new Scanner(System.in);

        int valorParaSaque = scanner.nextInt();

        if(this.saldo >= valorParaSaque){
            this.saldo-= valorParaSaque;

            System.out.println("o valor do saque foi : " + valorParaSaque + "e o saldo atual e" + saldo);
        }
     }
     //o metodo ja esta criado praticamente acredito
     //public double getSaldo () {
         
     //}
     //public void ConsultarSaldo() {
          
     //}
     //depois de criar os metodos tenho que chamalos na minha main,no meu arquivo principal basicamente
     
}