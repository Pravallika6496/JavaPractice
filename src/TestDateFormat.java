
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		Date date;
		try {
			date = df.parse("2019-12-10 01:30:00");
			String shortTimeStr = sdf.format(date);
			System.out.println(shortTimeStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}

}
