import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double w = scan.nextDouble();
		double h = scan.nextDouble();
		
		double bmi = w/(h*h);
		
		if(bmi > 25) {
			System.out.println("Overweight");
		} else if(bmi>=18.5 && bmi <= 25.0) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Underweight");
		}
		
		scan.close();
}
}
