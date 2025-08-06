package JavaClassPackage;

public class drivingEligibility {
int age =18;
	public static void main(String[] args) {
		drivingEligibility x = new drivingEligibility();
		int result = x.age;
		if (result>=18)
		{
			System.out.println(result +" " + "- this age is eligible for driving licence");
			
		}
		else
			
		{
			System.out.println(result + " " +"- this age is not eligible for driving licence!");
		}
	}

}
