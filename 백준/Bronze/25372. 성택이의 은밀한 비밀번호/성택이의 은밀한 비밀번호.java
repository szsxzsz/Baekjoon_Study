import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String b;
		int a;
		
		a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			b = scan.next();
			if(b.length() >= 6 && b.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
				
		}
			
		
		scan.close();

	}

}