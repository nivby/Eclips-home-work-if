package Examples;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");

		String name = input.nextLine();
		System.out.printf("Hellow to %s\n please enter your age\n", name);

		int age = input.nextInt();
		System.out.printf("your age is %d\n enter your FavColor\n", age);

		input.nextLine();

		String FavColor = input.nextLine();
		System.out.printf("your FavColor is %s\n ", FavColor);

	}

}
