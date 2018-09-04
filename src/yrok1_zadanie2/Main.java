package yrok1_zadanie2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle tr1=new Triangle(2,2,2);
		Triangle tr2=new Triangle();
		tr2.incoming_Values();
		
		System.out.printf("The area of the triangle entered manually %.2f",tr2.area());
		System.out.println();
		System.out.printf("The area of the triangle created in Main 2%.2f",tr1.area());  //Десятичное число с плавающей точкой.printf(String format, Object... args)
		
	}

}
