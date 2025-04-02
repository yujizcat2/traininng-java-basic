package NameAndAge;
import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {
		System.out.println("Please enter your name: ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Please enter your age: ");
		int age = new Scanner(System.in).nextInt();
		System.out.println("Hi, "+ name + ", You are " + age + " years old");
	}

}
