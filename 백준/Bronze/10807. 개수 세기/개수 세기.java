import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		int cnt = 0;
		
		for(int i = 0; i<a; i++) {
			arr[i] = scan.nextInt();
		}
		
		int b = scan.nextInt();
		for(int i = 0; i<arr.length; i++) {
			if(b == arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		scan.close();

	}

}
