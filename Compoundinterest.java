
public class Compoundinterest {
	double amount;
	double principal_ci;
	double rate_ci;
	double time_ci;
	Compoundinterest(double x,double y,double z)
	{
		principal_ci=x;
		rate_ci=y;
		time_ci=z;
	}
void CalculateCI()
{
	amount=principal_ci * Math.pow(1 + rate_ci/100, time_ci);
	System.out.println("The compound interest for a year is : " +amount);
}
}
