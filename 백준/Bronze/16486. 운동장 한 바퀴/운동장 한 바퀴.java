import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		System.out.println((2*a)+(2*b*3.141592));
		
		scan.close();
	}

}
