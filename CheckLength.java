package CalculateLength;
import java.util.Scanner;
public class CheckLength {
	public static void main(String[] args) {
		System.out.println("calculate the length");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		double x1 = sc.nextDouble();
		System.out.println("Enter the value of x2");
		double x2 = sc.nextDouble();
		System.out.println("Enter the value of y1");
		double y1 = sc.nextDouble();
		System.out.println("Enter the value of y2");
		double y2 = sc.nextDouble();
		double length;
		
		length = Math.sqrt((x2-x1)+(y2-y1)*(x2-x1)+(y2-y1));
		System.out.println("the length is :"+length);
		
	}

}
