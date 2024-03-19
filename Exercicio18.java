import java.util.Scanner;

public class Exercicio18 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.
      Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
      Média: 7.37 */

      System.out.println("Informe as três notas: ");
      double n1 = scan.nextDouble();
      double n2 = scan.nextDouble();
      double n3 = scan.nextDouble();

      double mediaHarmonica = 3 / ((1 / n1) + (1 / n2) + (1 / n3));

      System.out.printf("Média harmônica: %.2f", mediaHarmonica);


    scan.close();

  }
}
