import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int apple = (3*a)+(2*b)+(c*1);
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		int banana = (3*d)+(2*e)+(f*1);
		
		if(apple > banana) {
			System.out.println('A');
		} else if(apple == banana) {
			System.out.println('T');
		} else {
			System.out.println('B');
		}
		
				
		scan.close();
	}

}
