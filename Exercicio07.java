import java.util.Scanner;

public class Exercicio07 {
  public static void executar(){
    Scanner scan = new Scanner(System.in);

    /* Exercício 07 - Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
    este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
    o usuário também deverá ser informado.  */

    System.out.println("Informe um número: ");
    int num = scan.nextInt();

    if (num >= 100 && num <= 200) {
      System.out.println("O número " + num + " está dentro do intervalo 100 - 200");
    } else {
      System.out.println("O número " + num + " está fora do intervalo 100 - 200");
    }



    scan.close();
  }
}
