import java.util.Scanner;

public class Exercicio10 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 10 -  Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
    o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
    inválido!”.  */

    System.out.println("Informe um número de 1 a 5: ");
    int num = scan.nextInt();

    switch (num){
      case 1:
      System.out.println("Número um.");
      break;
      case 2: 
      System.out.println("Número dois.");
      break;
      case 3:
      System.out.println("Número três.");
      break;
      case 4:
      System.out.println("Número quatro.");
      break;
      case 5:
      System.out.println("Número cinco.");
      break;
      default: 
      System.out.println("O número informado está fora do intervalo de 1 a 5.");
    }







    scan.close();
  }
}
