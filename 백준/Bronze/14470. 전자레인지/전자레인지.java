import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int E = scan.nextInt();
		int t = 0;
		
		if(A<0) {
			t = (Math.abs(A)*C)+D+(B*E);
		} else {
			t = (B-A)*E;
		}
		
		
		
		System.out.println(t);
		scan.close();
}
}
