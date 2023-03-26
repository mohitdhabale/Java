abstract class Shape {
  public abstract double getArea();

  public void printArea() {
    System.out.println("The area is " + getArea());
  }
}

class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }
}

// Main program
class AbstractClass {
  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(5, 10);
    double rectArea = rectangle.getArea();
    rectangle.printArea();

  }
}
