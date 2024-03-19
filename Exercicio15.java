import java.util.Scanner;

public class Exercicio15 {
  public static void executar(){
    
Scanner scan = new Scanner(System.in);

  /* Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), calcule e retorne a distância entre eles. 
  A fórmula que efetua tal cálculo é: d = raiz (((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03 */

System.out.println("Infome dois pontos do plano P1 (x1 e y1): ");
double x1 = scan.nextDouble();
double y1 = scan.nextDouble();
System.out.println("Informe dois pontos do plano P2 (x2, y2): ");
double x2 = scan.nextDouble();
double y2 = scan.nextDouble(); 

double d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
System.out.printf("Distância: %.2f", d);








scan.close();
  }
}
