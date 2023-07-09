interface Shape{
    double calculateArea();
}

class Rectangle implements Shape{

    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length*breadth ;
    }
}

class Circle implements Shape{

    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea(){

        return 2*3.15*radius*radius;
    }
}

class Triangle implements Shape{
    
    double length;
    double height;

    Triangle(double length, double height)
    {
        this.length = length;
        this.height = height;
    }

    public double calculateArea(){
        return 0.5*length*height;
    }
}

class ShapeCalculator{
    public void printArea(Shape shape){
        System.out.println(shape.calculateArea());
    }
}


public class Question2 {
   
   public static void main(String[] args) {
    

    ShapeCalculator s = new ShapeCalculator();

    Rectangle r = new Rectangle(10,20);
    Circle c = new Circle(4);
    Triangle t = new Triangle(10,20);

    System.out.print("Area of Rectangle is : ");
    s.printArea(r);
    System.out.print("Area of circle is : ");
    s.printArea(c);
    System.out.print("Area of Triangle is : ");
    s.printArea(t);

   } 
}
