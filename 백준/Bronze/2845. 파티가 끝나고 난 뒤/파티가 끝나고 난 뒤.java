import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		int P = scan.nextInt();
		int a;
		for(int i = 0; i < 5; i++) {
			a = scan.nextInt();
			
			System.out.println(a-(L*P));
		}
		
		scan.close();
}
}
