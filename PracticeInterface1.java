interface Shape {
    double getArea();
}
    
class Rectangle implements Shape {
    private double length;
    private double width;
  
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
  
    public double getArea() 
    {
        return length * width;
    }
  }
  
   public class PracticeInterface1 {
    public static void main(String[] args) {

      Rectangle rectangle = new Rectangle(5, 10);
      double area = rectangle.getArea();
      
      System.out.println("The area of the rectangle is " + area);
    }
  }
  