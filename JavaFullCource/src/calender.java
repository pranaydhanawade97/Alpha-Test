import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat dt= new SimpleDateFormat("M/dd/yyy hh:mm:ss");
		System.out.println(dt.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.SHORT));
		

	}

}
