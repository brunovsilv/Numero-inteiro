import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {

  Scanner sc = new 
    Scanner (System.in);

    System.out.println("Me diga um número inteiro ");

    int numero = sc.nextInt();
    if (numero < 0) {
      System.out.println("numero negativo");
    } else {
      System.out.println("numero positivo");
  }
      sc.close();
  }
}