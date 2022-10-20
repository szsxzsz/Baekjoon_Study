import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		char b = a.charAt(0);
		int c = (int)b;
		System.out.println(c);
		
		scan.close();

	}

}