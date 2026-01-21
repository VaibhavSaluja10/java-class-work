package practiseassignment;

import java.util.Scanner;
public class days {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String day = sc.next();
		sc.close();
		
		switch(day) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("No. of days in this month: 31");
			break;
		case "April":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println("No. of days in this month: 30");
			break;
		case "Feb":
			System.out.println("No of days in this month: 29 or 28");
			break;
		default:
			System.out.println("Error");
		}
	}

}
