
interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    public void draw()
    {     
       System.out.println("It is a Rectangle class");
    }
}

class Circle implements Drawable{
    public void draw()
    {
        System.out.println("It is a circle class");
    }
}

public class Question4 {
    public static void main(String[] args) {
        
        Drawable d;

        d =new Rectangle();
        d.draw();

        d =new Circle();
        d.draw();


    }
}
