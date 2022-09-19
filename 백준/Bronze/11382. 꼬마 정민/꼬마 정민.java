import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Long A = scan.nextLong();
		Long B = scan.nextLong();
		Long C = scan.nextLong();
		
		System.out.println(A+B+C);
		
		scan.close();

	}

}