package introduction;

import java.util.ArrayList;

public class CorejavaBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check if else  arry has multiple of 2 
		int[] arr2 = {123,2,3,4,6,7,16,45,21,65,89,54,87,32,65,};
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i] % 2 == 0) 
			{
				System.out.println(arr2[i]+"is multiple of 2");
				
			}
			else
			{
				System.out.println(arr2[i] +"is not  multiple of 2");
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("pranay");
		a.add("dhanawade");
		a.add("vxl");
		a.add("123456");
		System.out.println(a.get(3));

	}

}
