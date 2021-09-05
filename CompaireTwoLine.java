package Comparision;
import java.util.Scanner;

public class CompaireTwoLine {
	public static void main(String[] args) {
		System.out.println("This is the program length calculate");
		 Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first length1");
		double length1 = sc.nextDouble();
		System.out.println("Enter the second length2");	
	    double length2 = sc.nextDouble();	
	System.out.println("the length is :" +length1);
		
	System.out.println("the length is :" +length2);
	if (length1 == length2)
		
	{
		
		System.out.println("both are equl");
	}
		else
		{
			System.out.println("both are not equl");
	}
	}

}
