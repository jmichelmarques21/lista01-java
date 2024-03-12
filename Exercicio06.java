import java.util.Scanner;

public class Exercicio06 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /* Exercício 06 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
    Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5 */

    System.out.println("Informe uma temperatura em graus Celsius: ");
    float tempCelsius = scan.nextFloat();

    float tempFahrenheit = (9 * tempCelsius + 160) / 5;

    System.out.println("A temperatura de " + tempCelsius + "ºC em graus Fahrenheit é: " + tempFahrenheit + "ºF");

    scan.close();
  }
}
