package yrok1_zadanie2;
import java.util.Scanner;
public class Triangle {
private float a,b,c;
Scanner in=new Scanner(System.in);
public Triangle(float a, float b, float c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}

public Triangle() {
	super();
}

//¬вод врчную и проверка на то что данные соответствую треугольнику
public void incoming_Values() {
	System.out.println("Enter the parties data а");
	a=in.nextFloat();
	System.out.println("Enter the parties data b");
	b=in.nextFloat();
	System.out.println("Enter the parties data с");
	c=in.nextFloat();
	System.out.println("Thank you");
	if (a + b > c & a + c > b & b + c > a) {
		System.out.println("Data entered correctly");	
	}
	else {System.out.println("Data entered incorrectly");}
	
}


double area() // area of a triangle
{
    float p = (getA() + getB() + getC()) / 2;
    return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC())); // sqrt вернЄт квадратный корень
    
}
public float getA() {
	return a;
}
public void setA(float a) {
	this.a = a;
}
public float getB() {
	return b;
}
public void setB(float b) {
	this.b = b;
}
public float getC() {
	return c;
}
public void setC(float c) {
	this.c = c;
}

}
