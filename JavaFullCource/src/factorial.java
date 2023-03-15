import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("which no is factorial :");
		int num= sc.nextInt();
		
		factorial fob=new factorial();
		int fact =fob.Factorial(num);
		
		System.out.println("factorial of "+num+"="+fact);
		
		
	}
	
	int Factorial(int n) {
		
		int fact=1;
		for(int seq=2;seq<=n;seq++)
		{
			fact *=seq;
		}
		return fact;
		
	}

}
