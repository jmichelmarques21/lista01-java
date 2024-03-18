import java.util.Scanner;

public class Exercicio12 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Escreva um algoritmo que receba o número do mês e mostre o mês
    correspondente. Valide mês inválido. */

    System.out.println("Infome um número de 1 a 12: ");
    int num = scan.nextInt();

    switch (num) {
      case 1:
      System.out.println("O número " + num + " é corresponde ao mês de Janeiro.");
      break;
      case 2:
      System.out.println("O número " + num + " é corresponde ao mês de Fevereiro.");
      break;
      case 3:
      System.out.println("O número " + num + " é corresponde ao mês de Março.");
      break;
      case 4:
      System.out.println("O número " + num + " é corresponde ao mês de Abril.");
      break;
      case 5:
      System.out.println("O número " + num + " é corresponde ao mês de Maio.");
      break;
      case 6:
      System.out.println("O número " + num + " é corresponde ao mês de Junho.");
      break;
      case 7:
      System.out.println("O número " + num + " é corresponde ao mês de Julho.");
      break;
      case 8:
      System.out.println("O número " + num + " é corresponde ao mês de Agosto.");
      break;
      case 9:
      System.out.println("O número " + num + " é corresponde ao mês de Setembro.");
      break;
      case 10:
      System.out.println("O número " + num + " é corresponde ao mês de Outubro.");
      break;
      case 11:
      System.out.println("O número " + num + " é corresponde ao mês de Novembro.");
      break;
      case 12:
      System.out.println("O número " + num + " é corresponde ao mês de Dezembro.");
      break;
      default:
      System.out.println("O número informado não corresponde a nenhum mês.");

    
    
    
    }






    scan.close();
  }
}
