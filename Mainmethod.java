
import java.util.Scanner;

public class Mainmethod {
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter principal value");
			double x =sc.nextDouble();
			System.out.println("enter time period  ");
             double y =sc.nextDouble();
 			System.out.println("enter rate value");
			double z =sc.nextDouble();
			Simpleinterest si=new Simpleinterest(x,y,z);
			si.calculateSI();
			Compoundinterest ci=new Compoundinterest(x,y,z);
			ci.CalculateCI();
		}


	}

}
