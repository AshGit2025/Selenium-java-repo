package JavaClassPackage;

public class gradeOfStudent {

	public static void main(String[] args) {
		int mark =100;
		if (mark>=81 && mark<=100)
		{
			System.out.println("A Grade");
		}
		else if (mark>=71 && mark<=80)
		{
			System.out.println("B Grade");
		}
		else if (mark>=61 && mark<=70)
		{
			System.out.println("C Grade");
		}
		else if (mark>=40 && mark<=60)
		{
			System.out.println("D Grade");
		}
		else if (mark <40)
		{
			System.out.println("Failed");
		}
	}

}
