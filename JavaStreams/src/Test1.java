import java.util.ArrayList;

public class Test1 {
     
	//Count the number of names starting with alphabest A in list 
	@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("abhijeet");
		names.add("Don");
		names.add("Abhishek");
		names.add("adam");
		names.add("ram");
		names.add("sunil");
		
		int count=0;
		
		for(int i=0; i<=names.size();i++)
		{
			String actul=names.get(i);
			if(actul.startsWith("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
}
