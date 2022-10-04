import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println((int)(N*0.78));
		System.out.println((int)((N-(N*0.8))*0.78+(N*0.8)));
		
		
		scan.close();

	}

}