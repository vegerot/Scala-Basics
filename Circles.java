public class Circles {
  private double radius;

  public static double calculateArea(double radius) {
    return (3 * Math.pow(radius, 2));
  }

  public double getArea() {
    return (calculateArea(radius));
  }

  public Circles(double radius) {
    this.radius = radius;
  }

  public static void main(String[] args) {
    Circles circle1 = new Circles(5);
    System.out.println(circle1.getArea());

    System.out.println(calculateArea(3));
  }
}
