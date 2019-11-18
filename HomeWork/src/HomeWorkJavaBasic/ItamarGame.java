package HomeWorkJavaBasic;

import java.util.Arrays;

public class ItamarGame {

	public static void main(String[] args) {
		int[] packOfCards1 = new int[26];
		int[] packOfCards2 = new int[26];

		for (int i = 0; i < packOfCards1.length; i++) {

			int cards1 = (int) (Math.random() * 14);
			packOfCards1[i] = cards1;

		}
		System.out.println(Arrays.toString(packOfCards1));
		for (int i = 0; i < packOfCards2.length; i++) {
			int cards2 = (int) (Math.random() * 14);
			packOfCards2[i] = cards2;

		}

		String[] playerNames = { "Itamar", "Vered" };
		for (int i = 0; i < playerNames.length; i++) {
			System.out.println(playerNames[i]);
		}
		System.out.println(Arrays.toString(packOfCards2));

		int pointsItamar = 0;
		int pointsVered = 0;
		int twoPoint = 0;

		for (int i = 0; i < packOfCards1.length; i++) {

			if (packOfCards1[i] > packOfCards2[i]) {
				pointsItamar++;

			} else if (packOfCards2[i] > packOfCards1[i]) {
				pointsVered++;

			} else {
				i = i + 2;
				if (packOfCards1[i] > packOfCards2[i]) {
					pointsItamar = pointsItamar + 2;

				} else if (packOfCards2[i] > packOfCards1[i]) {
					pointsVered = pointsVered + 2;

				}

			}
		}

		if (pointsItamar > pointsVered) {
			System.out.println(playerNames[0]);
			System.out.printf("is the winner whit %d points", pointsItamar);
		} else if (pointsItamar < pointsVered) {
			System.out.println(playerNames[1]);
			System.out.printf("is the winner whit %d points", pointsVered);

		} else {
			System.out.printf("%s and to %s have the same points %d", playerNames[0], playerNames[1], pointsItamar);
		}
	}

}
