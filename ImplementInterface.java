interface Shape {
    double getArea();
  }
  
  class Rectangle implements Shape {
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
  
  class Circle implements Shape {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    public double getArea() {
      return Math.PI * radius * radius;
    }
  }
  
  public class ImplementInterface {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        double rectArea = rectangle.getArea();
      
        Circle circle = new Circle(7);
        double circleArea = circle.getArea();
      
        System.out.println("The area of the rectangle is " + rectArea);
        System.out.println("The area of the circle is " + circleArea);
    }
  }
  