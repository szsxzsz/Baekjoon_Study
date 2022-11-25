import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String b = null;
		
		for(int i=0;i<a;i++) {
			b = scan.next();
			String c = b.toLowerCase();
			System.out.println(c);
		}
		
		
		scan.close();

	}

}
