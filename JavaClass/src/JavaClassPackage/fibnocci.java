package JavaClassPackage;

public class fibnocci {

	public static void main(String[] args) {
		int n = 10;
        int num1 = 0, num2 = 1;
        
        System.out.print("First 10 Fibonacci numbers: ");
            for (int i = 1; i <= n; i++) 
        {
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        

	}

}
