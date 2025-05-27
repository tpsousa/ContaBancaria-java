
public class Principal {
  public static void main(String[] args) {
      
      ContaBancaria contaBancaria = new ContaBancaria("thiago",1234, "thiago", 12.0);
      System.out.println("o saldo da conta e: " + contaBancaria.getSaldo());
      
      contaBancaria.Depositar();
      contaBancaria.getName();
      contaBancaria.Sacar();

  }
}