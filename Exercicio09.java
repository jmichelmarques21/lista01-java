import java.util.Scanner;

public class Exercicio09 {

  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 09 - Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
    diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
    Caso sejam diferentes, informe que são diferentes e qual número é o maior.  */

    System.out.println("Informe dois números: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    if (num1 > num2) {
      System.out.println("O número " + num1 + " é maior do que o número " + num2 + ".");
    } else if (num2 > num1) {
      System.out.println("O número " + num2 + " é maior do que o número " + num1 + ".");
    } else {
      System.out.println("Os números informados são iguais.");
    }


    scan.close();
  }
}
