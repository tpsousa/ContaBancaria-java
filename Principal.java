
public class Principal {
  public static void main(String[] args) {
      
      ContaBancaria contaBancaria = new ContaBancaria("João", 1234, "0001-01", 500.0);
      System.out.println("o saldo da conta e: " + contaBancaria.getSaldo());
      System.out.println( "o nome associado a conta e : " + contaBancaria.getName());
      System.out.println("digite o valor de deposito: "); 
      contaBancaria.Depositar();
      System.out.println("digite o valor que deseja sacar");
      contaBancaria.Sacar();
     // contaBancaria.ConsultarSaldo();
      System.out.println("o saldo atual da conta e: ");
      System.out.println("o saldo atual da conta e : " + contaBancaria.getSaldo());
  }
}