import java.util.Scanner;

public class Exercicio03 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 03 -  Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
      variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
      ao usuário que a sequência de números informados é inválida.  */

      System.out.println("Informe dois números inteiros: ");
      int a = scan.nextInt();
      int b = scan.nextInt();

      if (a == b) {
        System.out.println("A sequencia de numeros informados é inválida.");
      } else if (a > b) {
        System.out.println("O número " + a + " é maior do que " + b + ".");
      } else {
        System.out.println("O número " + b + " é maior do que " + a + ".");
      }



    scan.close();
  }
}
