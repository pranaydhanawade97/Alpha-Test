package introduction;

public class methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodsdemo d=new methodsdemo();
		String name =d.getData();
		System.out.println(name);
		methoddemo2 d1=new methoddemo2();
		d1.getUSerData();
		getData2();

	}
	public String getData()
	{
		System.out.println("pranay");
		return "dhanawade";
	}
	
	public static String getData2()
	{
		System.out.println("pranay1");
		return "dhanawade1";
	}

}
