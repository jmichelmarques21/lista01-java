import java.util.Scanner;

public class Exercicio20 {
  public static void executar(){

    Scanner scan = new Scanner(System.in);

    /*  Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, 
    utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média da viagem. */

    System.out.println("Informe o tempo da viagem: ");
    double tempo = scan.nextDouble();
    System.out.println("Informe a velocidade média da viagem: ");
    double velocidade = scan.nextDouble();

    double litros = (tempo * velocidade) / 12;

    System.out.println("O carro consumiu " + litros + " litros nessa viagem de " + tempo + " hora(s) com velocidade média de " + velocidade + "km/h.");

    scan.close();
  }
}
