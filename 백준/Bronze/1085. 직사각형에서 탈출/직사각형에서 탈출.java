import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if(Math.min(a, c-a) > Math.min(b, d-b)) {
			System.out.println(Math.min(b, d-b));
		} else {
			System.out.println(Math.min(a, c-a));
		}
		
		scan.close();

	}

}
