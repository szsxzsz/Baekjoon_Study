import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt(); // 물리
		int B = scan.nextInt(); // 화학
		int C = scan.nextInt(); // 생물
		int D = scan.nextInt(); // 지구과학
		int E = scan.nextInt(); // 역사
		int F = scan.nextInt(); // 지리
		
		int sum1=0;
		int total[] = {A,B,C,D};
		Arrays.sort(total);
		sum1=total[1]+total[2]+total[3];
		
		int sum2=Math.max(E,F);
		
		System.out.println(sum1+sum2);
		scan.close();
}
}
