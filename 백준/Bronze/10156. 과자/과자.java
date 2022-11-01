import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int s = (a*b)-c;
		
		if(s>=0) {
			System.out.println(s);
		} else {
			System.out.println(0);
		}
		
		scan.close();

	}

}
