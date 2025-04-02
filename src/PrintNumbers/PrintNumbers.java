package PrintNumbers;
import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		System.out.println("Enter how many numbers you want to print: ");
		int num = new Scanner(System.in).nextInt();
		for (int i = 1; i<num+1; i++) {
			System.out.print(i + " ");
		}
	}

}
