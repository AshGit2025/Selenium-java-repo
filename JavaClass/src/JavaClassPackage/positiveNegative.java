package JavaClassPackage;

public class positiveNegative {
int num = -2;
	public static void main(String[] args) 
	{
		positiveNegative x = new positiveNegative();
		int result = x.num;
		if (result>=0)
		{
			System.out.println (result +" " + "is a positive value");
			
		}
		else
		{
			System.out.println(result +" " + "is a negative value");
		}

	}

}
