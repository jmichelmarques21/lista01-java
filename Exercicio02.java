import java.util.Scanner;

public class Exercicio02 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 02 - Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
      resultado da sua soma.  */

      System.out.println("Informe dois números: ");
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      int soma = num1 + num2;

      System.out.println("A soma dos dois números é: " + soma);



    scan.close();
  }
}
