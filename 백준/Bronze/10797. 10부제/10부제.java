import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int b[] = new int[5];
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			b[i] = scan.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			if(b[i]==n) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		scan.close();

	}

}
