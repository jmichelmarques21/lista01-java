import java.util.Scanner;

public class Exercicio19 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volume calculado de acordo com a seguinte fórmula: 
    volume = 3.14 * raio2 * altura;
    Exemplo: raio = 10, altura = 15. Volume = 4710 */

    System.out.println("Informe o valor do raio do cilindro: ");
    double raio = scan.nextDouble();
    System.out.println("Informe a altura do cilindro: ");
    double altura = scan.nextDouble();

    double volume = 3.14 * Math.pow(raio, 2) * altura;

    System.out.printf("O volume do cilindro é: %.0f", volume);


    scan.close();
  }
}
