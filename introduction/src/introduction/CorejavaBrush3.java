package introduction;

public class CorejavaBrush3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s1 = "Rahul Shetty Academy";
		String s5 = "Rahul Shetty Academy";
		
		
		String s2 =new String("welcome");
		String s3 =new String("welcome");
		
		String s = "Pranay Namdev Dhanwade";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		//one one char printed line wise
		for (int i =0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		
		//reverse char printed 
		//for (int i=s5.length()-1;i>=0;i--) 
		{	
			//System.out.println(s5.charAt(i));
			
		}
		
		
	}

}
