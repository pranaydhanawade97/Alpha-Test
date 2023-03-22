package introduction;

public class corejavabrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Mynum= 5;
		String wesite = "Prnay dhanwade";
		char letter ='r';
		double dec =5.99;
		boolean mycard =true;
		
		System.out.println(Mynum+"this is number");
		System.out.println(wesite);
		System.out.println(dec);
		System.out.println(mycard);

		//Arrays
		//type 1
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=6;
		arr[4]=7;
		
		//type 2
		int[] arr2 = {123,2,3,6,7};
		
		//System.out.println(arr2[0]);
		
		//for loop
	//	for(int i= 0; i<arr.length; i++) 
		//{
			//System.out.println(arr[i]);
			
		//}
		
		String[] name = {"pranay","dhanawade","one"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		for(String s: name)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
	}

}
