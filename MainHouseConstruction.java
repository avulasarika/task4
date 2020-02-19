import java.util.Scanner;
public class MainHouseConstruction {
			public static void main(String args[])
			
			{
				String c;
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("enter area of House in square feet");
					double x =sc.nextDouble();
					System.out.println("enter materials standard usage");
				     sc.nextLine();
				    c = sc.nextLine();
                    Houseconstruction h=new Houseconstruction(x);
					h.calculation(c);
					
				}


			}

}
