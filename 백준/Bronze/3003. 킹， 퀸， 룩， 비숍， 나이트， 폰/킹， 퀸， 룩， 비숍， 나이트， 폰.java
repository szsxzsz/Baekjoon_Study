import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] chess = {1,1,2,2,2,8};
		
		int[] a = new int[6];
		
		for(int i=0; i<chess.length; i++) {
			a[i] = scan.nextInt();
			System.out.print((chess[i]-a[i])+" ");
		}
		
		scan.close();

	}

}