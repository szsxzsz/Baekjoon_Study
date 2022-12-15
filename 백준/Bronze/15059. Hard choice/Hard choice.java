import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		if(d>a) {
			sum1 = d-a;
		}
		if(e>b) {
			sum2 = e-b;
		}
		if(f>c) {
			sum3 = f-c;
		}
		
		System.out.println(sum1+sum2+sum3);
		
	}

}
