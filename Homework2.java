/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


interface Shape{
    abstract double getArea();
}

class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double l,double w){
        length=l;
        width=w;
    }

    public double getArea(){
        return length*width; 
    }
    public String toString(){
        return "Area:"+getArea();
    }
}

class Triangle implements Shape{
    private double base;
    private double height;
    public Triangle(double b,double h){
        base=b;
        height=h;
    }
    
    public double getArea(){
        return base*height/2;
    }
    public String toString(){
        return "Area:"+getArea();
    }
}
public class Homework2{
    public static void main(String args[]){
        Rectangle rectangle;
        Triangle triangle;

        rectangle=new Rectangle(10,5);
        System.out.println(rectangle);
        triangle=new Triangle(10,5);
        System.out.println(triangle);
    }
}
