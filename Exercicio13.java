import java.util.Scanner;

public class Exercicio13 {
  public static void executar(){
    
    Scanner scan = new Scanner(System.in);

  /* Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
  operador em outra variável do tipo CARACTERE. Imprima o resultado da operação  */
  
  System.out.println("Informe dois números reais: ");
  float num1 = scan.nextFloat();
  float num2 = scan.nextFloat();
  System.out.println("Informe uma operação matemática (+ - * /): ");
  char operador = scan.next().charAt(0);

  switch(operador) {
    case '+':
    System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + (num1 + num2) + ".");
    break;
    case '-':
    System.out.println("A subtração entre " + num1 + " e " + num2 + " é: " + (num1 - num2) + ".");
    break;
    case '*':
    System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é: " + (num1 * num2) + ".");
    break;
    case '/':
    System.out.println("A divisão entre " + num1 + " e " + num2 + " é: " + (num1 / num2) + ".");
    break;
    default: 
    System.out.println("O tipo de operação matemática está incorreto. Revise o valor informado e tente novamente.");

  }


  


    scan.close();
  }
}
