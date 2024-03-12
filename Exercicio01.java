import java.util.Scanner;

public class Exercicio01 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 01 - Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
      mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
      menor ou igual a 10!”, caso este número seja menor ou igual.  */

      System.out.println("Digite um número: ");
      int num = scan.nextInt();

      if (num <= 10) {
        System.out.println("O número é menor ou igual a 10.");
      } else {
        System.out.println("O número é maior do que 10.");
      }



    scan.close();

  }
}
