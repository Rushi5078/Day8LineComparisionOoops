package LineComparasion;
import java.util.Scanner;

public class CalculateLengths {

	
	

		// Declaration Part
		static	int x1,x2,y1,y2;
		static	double dis;
	    
	    
	    //create the function 
	         public static void getUserInput() {
	        		

			// Get the input from user
			Scanner sc=new Scanner(System.in);

			System.out.println("enter x1 point");
			x1=sc.nextInt();

			System.out.println("enter y1 point");
			y1=sc.nextInt();

			System.out.println("enter x2point");
			x2=sc.nextInt();

			System.out.println("enter y2 point");
			y2=sc.nextInt();
	 
	         
	         }
	    
	    //create the function to calculate the length of line
	    public static void calculateLength() {
	   
	    		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	    
	    }
	    
	    public static void show() {
	     		System.out.println("Length between "+"("+x1+","+y1+"),"+"("+x2+","+y2+") :"+dis);    
	    }

	  
	  public static void main(String arg[]) {
         // Calling the function
	 
	      getUserInput();
	      calculateLength();
	      show();

		}

	}
