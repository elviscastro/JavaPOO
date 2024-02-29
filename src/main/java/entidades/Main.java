import java.util.Scanner;
import entidades.Triangulo;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Triangulo x, y;
    x = new Triangulo();
    y = new Triangulo();

    System.out.println("Digite as medidas do triangulo X:");
    x.setA(in.nextDouble());
    x.setB(in.nextDouble());
    x.setC(in.nextDouble());

    System.out.println("Digite as medidas do triangulo Y:");
    y.setA(in.nextDouble());
    y.setB(in.nextDouble());
    y.setC(in.nextDouble());

    System.out.printf("Area de X: %.4f%n", x.getArea());
    System.out.printf("Area de Y: %.4f%n", y.getArea());

    if (x.getArea() > y.getArea()) {
      System.out.println("- Maior area: X");
    } else {
      System.out.println("- Maior area: Y");
    }

    in.close();
  }
}