import java.util.Scanner;

public class Exercicio17 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Elabore um algoritmo que receba três notas de um aluno os pesos referentes a cada nota e retorne a sua média ponderada. 
    Veja o cálculo da média ponderada: Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 / peso1 + peso2 + peso3 
    Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
    Média ponderada = 8.25 */

    System.out.println("Informe as três notas: ");
    double n1 = scan.nextDouble() * 5;
    double n2 = scan.nextDouble() * 3;
    double n3 = scan.nextDouble() * 2;

    double mediaPonderada = (n1 + n2 + n3) / 10;

    System.out.printf("A média ponderada é: %.2f", mediaPonderada);
    scan.close();

  }
}
