import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a==b && b==c) {
			System.out.println("*");
		} else if(a==b && b!=c) {
			System.out.println("C");
		} else if(a!=b && b==c) {
			System.out.println("A");
		} else if(a==c && a!=b) {
			System.out.println("B");
		}
		
		scan.close();
	}

}
