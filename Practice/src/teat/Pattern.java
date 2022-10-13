package teat;
import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
	System.out.println("Pattern of these number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(j);
		}
		for(int j=i-1; j>=1; j--) {
			System.out.print(j);	
		}
		System.out.println();
	}
}
}
