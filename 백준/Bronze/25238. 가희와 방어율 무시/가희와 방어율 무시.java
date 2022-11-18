import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		if(a-(a*(b/100)) >= 100) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
		scan.close();

	}

}
