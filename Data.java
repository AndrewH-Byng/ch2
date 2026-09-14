public class Data {
	public static void main(String[] args) {
		//variables
		int date = 14;
		int year = 2026;
		String month = "September ";
		String day = "Monday";
		String americanformat = "American format: ";
		String europeanformat = "European format: ";
		
		//American Format
		System.out.print(americanformat);
		System.out.print(day+", ");
		System.out.print(month);
		System.out.print(date);
		System.out.print(",");
		System.out.print(" ");
		System.out.println(year);
		
		//European Format
		System.out.print(europeanformat);
		System.out.print(day+" ");
		System.out.print(date+" ");
		System.out.print(month);
		System.out.println(year);
		
	}
}
