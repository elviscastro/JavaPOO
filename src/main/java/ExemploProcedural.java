
import java.util.Scanner;

public class ExemploProcedural {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    double xA, xB, xC, yA, yB, yC;

    System.out.println("Digite as medidas do triangulo X:");
    xA = in.nextDouble();
    xB = in.nextDouble();
    xC = in.nextDouble();

    System.out.println("Digite as medidas do triangulo Y:");
    yA = in.nextDouble();
    yB = in.nextDouble();
    yC = in.nextDouble();

    double pX = (xA + xB + xC) / 2.0;
    double aX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

    double pY = (yA + yB + yC) / 2.0;
    double aY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

    System.out.printf("Area de X: %.4f%n", aX);
    System.out.printf("Area de Y: %.4f%n", aY);

    if (aX > aY) {
      System.out.println("Maior area: X");
    } else {
      System.out.println("Maior area: Y");
    }

    in.close();
  }
}
