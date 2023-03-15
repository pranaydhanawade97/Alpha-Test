import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter first number:");
		int no1=sc.nextInt();
		
		System.out.print("enter second number:");
		int no2=sc.nextInt();
		
		
		System.out.print("enter required operation[+,-,*,/] ");
		char operator=sc.next().charAt(0);
		
		if(operator=='+'|| operator=='-'|| operator=='*'|| operator=='/') 
		{
		int res = calculate(no1,no2,operator);
		
		System.out.println(no1+""+operator+""+no2+"="+res);
		}
		else
		{
			System.out.println("Invalid operator-> please enter +,-,*,/");
			
		}
		
		
		sc.close();
		
		

	}

	//--method the perfome operation
	static int calculate (int x , int y , char operator) {
		int res=0;
		switch(operator) 
		{
		case'+':
			res=x+y;
			break;
		case'-':
			res=x-y;
			break;
		case'*':
			res=x*y;
			break;
		case'/':
			res=x/y;
			break;
		}
		return res;
	}
	
}
