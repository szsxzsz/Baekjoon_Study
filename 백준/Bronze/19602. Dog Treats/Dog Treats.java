import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int r = 1*a+2*b+3*c;
		
		if(r >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
		
				
		scan.close();
	}

}
