import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int want1=0;
		int want2=0;
		int want3=0;
		
		if(N>=A) {
			want1 = A;
		} else {
			want1 = N;
		}
		
		if(N>=B) {
			want2 = B;
		} else {
			want2 = N;
		}
		
		if(N>=C) {
			want3 = C;
		} else {
			want3 = N;
		}
		
		System.out.println(want1+want2+want3);
		
		scan.close();
}
}
