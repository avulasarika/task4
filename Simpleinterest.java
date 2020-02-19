
public class Simpleinterest {
 double principal_si,time_si,rate_si;
 double result;
 Simpleinterest(double x,double y,double z)
 {
	 principal_si=x;
	 time_si=y;
	 rate_si=z;
 }
void calculateSI()
{
	result=(principal_si*time_si*rate_si)/100;
	System.out.println("The Simple interest for a year is : " +result);
}
}
