package entidades;

public class Triangulo {

  public double a;
  public double b;
  public double c;

  public Triangulo() {
  }

  public Triangulo(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void setA(double a) {
    this.a = a;
  }

  public void setB(double b) {
    this.b = b;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  public double getArea() {
    double p = (a + b + c) / 2.0;
    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return area;
  }

}