import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A= scan.nextInt();
		int B= scan.nextInt();
		int C= scan.nextInt();
		
		if(B+C > 59) {
			A += (B+C)/60;
			B = (B+C)%60;

			if(A > 23) 
				A= A-24;
				System.out.println(A+" "+B);
		} else {
				System.out.println(A+" "+(B+C));
			}
			
		
		scan.close();

	}

}
