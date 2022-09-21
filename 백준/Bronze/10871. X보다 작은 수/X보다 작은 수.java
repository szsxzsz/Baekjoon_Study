import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] a = new int[N];
		for(int i =0; i<N; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(a[i] < X) {
				System.out.print(a[i]+" ");
			}
		}
		
		scan.close();

	}

}