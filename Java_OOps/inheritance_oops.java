import java.util.*;

class Shape{
    String color;
    float l;
    float h;
    float r;

    public void area() {
        System.out.println("Display Area --> ");
    }
}

class Triangle extends Shape {
   public void area(int l, int h)
   {
       System.out.println(1/2 * l * h);
   } 
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h)
    {
        System.out.println((1/2) * l * h);
    }
}

class Circle extends Shape {
    public void area(int r)
    {
        System.out.println((22/7) * r * r);
    }
}

public class inheritance_oops {
    public static void main(String[] args) {
        
    }
}
