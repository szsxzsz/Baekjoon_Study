import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b == 1 || b == 2) {
			System.out.println("NEWBIE!");
		} else if(b > a) {
			System.out.println("TLE!");
		} else {
			System.out.println("OLDBIE!");
		}
		
		scan.close();

	}

}
