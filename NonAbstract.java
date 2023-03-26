// Define a class
class Rectangle {
    private double length;
    private double width;
  
    public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }
  
    // Define a non-abstract method
    public double getArea() {
      return length * width;
    }
  }
  
  // Main program
  public class NonAbstract {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        double area = rectangle.getArea();
      
      System.out.println("The area of the rectangle is " + area);
    }
  }
  