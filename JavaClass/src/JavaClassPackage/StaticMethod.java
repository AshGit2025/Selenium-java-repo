package JavaClassPackage;

public class StaticMethod {
static String name = "Aswathy";
	public static void main(String[] args) {
		
		//---out directly
		//System.out.println(name);
		
		//---out by creating object
		//StaticMethod variables=new StaticMethod();
	//String value = variables.name;
		//System.out.println(value);
		
		//---out using className
				System.out.println(StaticMethod.name);
	}

}
