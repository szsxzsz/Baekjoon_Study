import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		if(month<2) {
			System.out.println("Before");
		} else if(month == 2) {
			if(day<18) {
				System.out.println("Before");
			} else if(day==18) {
				System.out.println("Special");
			} else {
				System.out.println("After");
			}
		} else {
			System.out.println("After");
		}
}
}
