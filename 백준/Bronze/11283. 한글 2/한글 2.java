import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char a = scan.next().charAt(0);
		int b = (int)a;
		System.out.println(b-44031);
		
		scan.close();
}
}
