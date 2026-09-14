public class Time {
	public static void main(String[] args) {
		//variables
		int hour = 13;
		int minute = 20;
		int second = 10;
		
		System.out.print("number of seconds since midnight");
		System.out.println(" "+(hour*3600+minute*60+second));
		
		System.out.print("number of seconds remaining in the day");
		System.out.println(" "+(((24*3600)-(hour*3600+minute*60+second)));
		System.out.print("percentage of the day that has passed");
		System.out.println(" "+((hour*3600.0+minute*60.0+second)/(24.0*3600.0))*100.0);
	}
}
		
		
