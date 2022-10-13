package teat;
import java.util.Scanner;
public class Traingle {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		if(sum == 180) {
			System.out.println("Prize 1");
		}
		if(sum == 90) {
			System.out.println("Prize 2");
		}
		if(sum < 90) {
			System.out.println("Prize 3");
		}
	}
}
