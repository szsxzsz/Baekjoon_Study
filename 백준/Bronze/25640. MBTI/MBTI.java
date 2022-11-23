import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String mbti = scan.nextLine();
		int a = scan.nextInt();
		String mbti2 = null;
		int cnt = 0;
		
		for(int i=0;i<=a;i++) {
			mbti2 = scan.nextLine();
			if(mbti.equals(mbti2)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		scan.close();

	}

}
