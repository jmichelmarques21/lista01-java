import java.util.Scanner;

public class Exercicio08 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 08 - Escreva um algoritmo que leia um número e mostre uma mensagem caso este
    número seja maior ou igual a 50, outra se ele for menor que 50. */

    System.out.println("Informe um número: ");
    int num = scan.nextInt();

    if (num >= 50) {
      System.out.println("O número " + num + " é maior ou igual a 50.");
    } else {
      System.out.println("O número " + num + " é menor do que 50.");
    }



    scan.close();
  }
}
