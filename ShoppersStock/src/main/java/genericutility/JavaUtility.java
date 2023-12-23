package genericutility;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public static  int getRandomNumber() {
		Random random = new Random();
		int randomnumber =random.nextInt(1000);
		return randomnumber;
		
	}
		
		public static void main (String[] args) {

		int random1 =getRandomNumber();
		System.out.println(random1);	
		getSystemDate();
		getDateAndTime();
		
		
	}

		public  static  String  getSystemDate() {
		Date date= new Date();
			System.out.println(date);
			SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
			String formateddate = sdf.format(date);
			return formateddate;
		}
		public static String  getDateAndTime() {
			Date date= new Date();
			System.out.println(date);
			 String d= date.toString().replace(" ", "_").replace(":", "_");
			 return d;
			
			
		}
		
	
}
