import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i =N; N>=1; N--) {
			System.out.println(N);
		}
		
		scan.close();

	}

}
