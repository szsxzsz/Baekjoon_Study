import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a = 1;
		for(int i=N;i>=1;i--) {
			a = a*i;
		}
		System.out.println(a);
		scan.close();

	}

}