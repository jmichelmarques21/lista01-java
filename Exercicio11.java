import java.util.Scanner;

public class Exercicio11 {
  public static void executar(){
    Scanner scan = new Scanner(System.in);

  /* Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em
  ordem crescente.  */
  
  System.out.println("Informe três números inteiros: ");
  int num1 = scan.nextInt();
  int num2 = scan.nextInt();
  int num3 = scan.nextInt();

  if (num1 > num2 && num1 > num3) {
    if (num2 > num3) {
      System.out.println("Ordem crescente: " + num1 + ", " + num2 + " e " + num3 + ".");
    } else {
      System.out.println("Ordem crescente: " + num1 + ", " + num3+ " e " + num2 + ".");
    }
  } else if (num2 > num1 && num2 > num3) {
    if (num1 > num3) {
      System.out.println("Ordem crescente: " + num2 + ", " + num1 + " e " + num3 + ".");
    } else {
      System.out.println("Ordem crescente: " + num2 + ", " + num3 + " e " + num1 + ".");
    }
  } else {
    if (num1 > num2) {
      System.out.println("Ordem crescente: " + num3 + ", " + num1 + " e " + num2 + ".");
    } else {
      System.out.println("Ordem crescente: " + num3 + ", " + num2 + " e " + num1 + ".");
    }
  }

    scan.close();
  }
}
