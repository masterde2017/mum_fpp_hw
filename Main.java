package prog1_4_5;

import java.util.Scanner;

public class Main {
	
	public static void help(String s) {
		
	}
	public static void main(String[] args) {
		System.out.print("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle\n ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String enterType= sc.nextLine();
		
		if(enterType.equalsIgnoreCase("R")) {
			System.out.print("Enter the width of the Rectangle:");
			double width=sc.nextDouble();
			System.out.print("Enter the height of the Rectangle:");
			double height=sc.nextDouble();
			System.out.print("The area of Rectangle is : "+new Rectangle(width,height).getArea());
		}else if(enterType.equalsIgnoreCase("C")) {
			System.out.print("Enter the radius of the Circle:");
			double r=sc.nextDouble();
			System.out.print("The area of Circle is : "+new Circle(r).getArea());
		}else if(enterType.equalsIgnoreCase("T")) {
			System.out.print("Enter the base of the Triangle:");
			double base=sc.nextDouble();
			System.out.print("Enter the height of the Triangle:");
			double height=sc.nextDouble();
			System.out.print("The area of Rectangle is : "+new Triangle(base,height).getArea());
			
		}else {System.out.print("Wrong input!!!");}
				

	}

}
