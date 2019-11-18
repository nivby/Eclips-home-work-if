package HomeWorkJavaBasic;

import java.util.Arrays;
import java.util.Scanner;

public class TheGameWar {

	public static void main(String[] args) {

		int[] Player1 = new int[26];
		int[] player2 = new int[26];
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < Player1.length; i++) {
			Player1[i] = (int) (Math.random() * 13) + 1;
		}

		for (int i = 0; i < player2.length; i++) {
			player2[i] = (int) (Math.random() * 13) + 1;
		}

		Scanner namePlayer1 = new Scanner(System.in);
		System.out.println("player 1, enter your name");
		String name1 = namePlayer1.nextLine();
		System.out.println("hello " + name1);

		Scanner namePlayer2 = new Scanner(System.in);
		System.out.println("player 2, enter your name");
		String name2 = namePlayer2.nextLine();
		System.out.println("hello " + name2);
		System.out.println("let's start the Game ! ");

		for (int i = 0; i < Player1.length; i++) {

			if (Player1[i] > player2[i]) {
				count1++;
			} else if (Player1[i] == player2[i]) {
				i = i + 2;
				if (Player1[i] > player2[i]) {
					count1 = count1 + 2;
					{
						count2 = count2 + 2;
					}
				}
			} else {
				count2++;
			}
		}

		System.out.println(Arrays.toString(Player1));
		System.out.println(Arrays.toString(player2));

		System.out.println(count1);
		System.out.println(count2);

		if (count1 > count2) {
			System.out.println("the winner is player1: " + name1 + " with: " + count1);
		} else if (count1 == count2) {
			System.out.println("the game it's equal, both player with:" + count1);
		} else {
			System.out.println("the winner is player2: " + name2 + " with: " + count2);
		}

	}

}
