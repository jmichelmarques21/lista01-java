import java.util.Scanner;

public class Exercicio05 {
  
    public static void executar(){

  Scanner scan = new Scanner(System.in);

  /* Exercício 05 - Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
  da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
  valor da variável A. Apresentar uma mensagem com o valor original de cada variável
  e outra com os valores trocados. */

      System.out.println("Digite dois números: ");
      int a = scan.nextInt();
      int b = scan.nextInt();

      System.out.println("Números informados: ");
      System.out.println("Variável A: " + a);
      System.out.println("Variável B: " + b);

      int c = a;
      a = b;
      b = c;

      System.out.println("Números trocados: ");
      System.out.println("Variável A: " + a);
      System.out.println("Variável B: " + b);
      





  scan.close();
  }
}
