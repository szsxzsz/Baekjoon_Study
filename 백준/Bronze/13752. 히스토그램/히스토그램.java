import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=0;i<a;i++) {
			int b = scan.nextInt();
			for(int j=0;j<b;j++) {
				System.out.print("=");	
			}
			System.out.println();
		}
		
		scan.close();
}
}
