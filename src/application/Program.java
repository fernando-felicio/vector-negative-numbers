package application;
import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter? ");
		int n = scanner.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i < vect.length; i++) {
			System.out.println("Type a number: " + (i +1));
			vect[i] = scanner.nextInt();
		}
		
		System.out.println("Negative numbers: ");
		
		for (int i =0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		scanner.close();
		
	}

}
