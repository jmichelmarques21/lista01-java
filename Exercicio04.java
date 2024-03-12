import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {

  Scanner scan = new Scanner(System.in);

  /* Exercício 04 - Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
    multiplicação e a divisão dos números lidos.  */

    System.out.println("Informe dois números: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    int soma = num1 + num2;
    int subt = num1 - num2;
    int mult = num1 * num2;
    double div = (double) num1 / num2;


    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + subt);
    System.out.println("Multiplicação: " + mult);
    System.out.printf("Divisão: %.2f",  div);

  scan.close();
  }
}
