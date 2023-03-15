import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int number=sc.nextInt();
		
		if (number>10) 
		{
			System.out.println(number+"this number is greater than 10");
			
		}
		else if(number==10) 
		{
			System.out.println("number is equal to 10");
		}
		else		{
			System.out.println("number is less than 10");
		}
	}

}
