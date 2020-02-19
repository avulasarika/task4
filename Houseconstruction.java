
public class Houseconstruction {
	double area_of_house;
	double result;
	Houseconstruction(double area)
	{
		area_of_house = area;
		
	}
	void calculation(String materials)
	{
				
		switch(materials) {
		case "standard materials" :
		     result = 1200 * area_of_house;
			System.out.println("construction cost per square feet is " +result);
			break;
		case "above standard materials" :
		     result = 1500 * area_of_house;
			System.out.println("construction cost per square feet is " +result);
			break;
		case "high standard materials" :
		     result = 1800 * area_of_house;
			System.out.println("construction cost per square feet is " +result);
			break;
		case "high standard materials and fully automated" :
		     result = 2500 * area_of_house;
			System.out.println("construction cost per square feet is " +result);
			break;
		default :
			System.out.println("not defined");
			
			}
		
	}
}
