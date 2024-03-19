import java.util.Scanner;

public class Exercicio16 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /*  Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. 
        Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */

        System.out.println("Informe as três notas do aluno: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("A média do aluno é: %.2f", media);





    scan.close();
  }
}
