import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if((a == 8 || a == 9) && (d == 8 || d == 9) && b == c) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
				
		scan.close();
	}

}
