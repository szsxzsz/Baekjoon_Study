import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int score2 = 0;
		int a = 0;
		int b = 0;
		for(int i=0; i<4;i++) {
			a = scan.nextInt();
			score += a;
		}
		for(int i =0; i<4;i++) {
			b = scan.nextInt();
			score2 += b;
		}
		if(score>=score2) {
			System.out.println(score);
		} else {
			System.out.println(score2);
		}
		
		
		scan.close();

	}

}
