import java.text.SimpleDateFormat;
import java.util.Date;

public class printdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d=new Date();	
		System.out.println(d.toString());
		
		SimpleDateFormat d1=new SimpleDateFormat("M/d/yyyy");
		System.out.println(d1.format(d));
		
		SimpleDateFormat d2=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		System.out.println(d2.format(d));
		
		

	}

}
