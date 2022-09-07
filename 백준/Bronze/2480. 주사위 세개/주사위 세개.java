import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int money=0;
		if(A==B && B==C) {
			money = 10000 + (A*1000);
		} else if(A==B || B==C || C==A) {
			if(A==B) {
				money = 1000 + (A*100);
			} else if (B==C) {
				money = 1000 + (B*100);
			} else {
				money = 1000 + (C*100);
			}
		} else if(A != B && B != C && C != A) {
			if(A > B && A > C) {
				money = A*100;
			} else if(B > A && B > C) {
				money = B*100;
			} else if(C > A && C > B) {
				money = C*100;
			}
		}
		
		System.out.println(money);

		scan.close();

	}

}
