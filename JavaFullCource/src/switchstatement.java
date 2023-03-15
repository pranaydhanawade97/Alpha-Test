import java.util.Scanner;

import com.mysql.cj.protocol.x.CompressionSplittedOutputStream;

public class switchstatement {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter Grade:");
		
		Scanner sc=new Scanner(System.in);
		
		char grade= sc.next().charAt(0);
		
		switch(grade)
		{
			case'A':
				System.out.println("Excellent");
				break;
			case'B':
				System.out.println("Good");
				break;
			case'C':
				System.out.println("Well Done");
				break;
			case'D':
				System.out.println("You Passed");
				break;
			case'E':
				System.out.println("Better try again");
				break;
			case'F':
				System.out.println("Failed");
				break;
				
				default:
					System.out.println("Invalid grade");
				
		}
		
	}

}
