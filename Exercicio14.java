import java.util.Scanner;

public class Exercicio14 {
  public static void executar(){

  Scanner scan = new Scanner(System.in);

  /* A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA). 
  Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), r é a razão e a1 é o primeiro termo da Progressão Aritmética. 
  Escreva um algoritmo que encontre o n-ésimo termo de uma progressão aritmética. 
  Exemplo: a1 = 10, n = 7, r = 3. Resultado: an = 28 */

  System.out.println("Informe o primeiro termo: ");
  int a1 = scan.nextInt();
  System.out.println("Informe a razão: ");
  int r = scan.nextInt();
  System.out.println("Informe o termo de ordem: ");
  int n = scan.nextInt();

  int an = a1 + (n -1) * r;

  System.out.println("Resultado: " + an);
  




  scan.close();

  }
}
