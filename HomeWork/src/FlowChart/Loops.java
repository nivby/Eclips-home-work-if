package FlowChart;

public class Loops {

	public static void main(String[] args) {

//		exercise 1 (exempale):
//
//		int min = 0;
//		int max = 10;
//
//		while (min < max) {
//			System.out.println(max);
//			max--;
//		}

//		exercise 2 (exempale):

//		Scanner input = new Scanner(System.in);
//		System.out.println("please enter your name");
//		String name = input.nextLine();

//		String emptyString = "";
//		String spaceString = " ";
//		int wrongCounter = 0;
//
//		while (name.trim().isEmpty()) {
//
//			System.err.println("please enter a valid name!");
//			name = input.nextLine();
//			wrongCounter++;
//
//		}
//
//		System.out.printf("%s %s", (wrongCounter > 0 ? "Finally you did it" : "Amazing its your first time"), name);

//		exercise 3 (exempale):

//		int min = 0;
//		int max = 10;
//
//		while (min < max) {
//
//			if (min % 2 != 0) {
//				min++;
//				continue;
//			}
//			System.out.println(min);
//			min++;
//
//		}

//		exercise 4 (exempale):
//
//		int min = 1;
//		int max = 10;
//
//		Scanner input = new Scanner(System.in);
//
//		while (min < max) {
//			System.out.println("enter your name:");
//			String name = input.nextLine();
//
//			while (name.trim().isEmpty()) {
//				System.err.println("please enter a valid name:");
//				name = input.nextLine();
//			}
//
//			System.out.printf("Hello:%s, your position is:%d\n", name, min);
//			min++;
//
//		}

//			exercise 5 (exempale) for:
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//
//		}

//		exercise 6 (exempale) for:
//
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//
//		}

//		exercise 7 (exempale) for:
//
//		for (int i = 0; i < 10; i++) {
//			if (i == 8) {
//				break;
//			}
//			System.out.println(i);
//		}

//		exercise 8 (exempale) for:
//
//		for (int i = 0; i < 10; i++) {
//
//			for (int j = 0; j < 10; j++) {
//				System.out.printf("i:%d, j:%d\n", i, j);
//			}
//
//		
//		exercise 9 (exempale) Arrays:
//		
//		String[] friends = { "Niv", "Shai", "Amit", "Tamir" };
//
//		int position = 0;
//
//		while (position < friends.length) {
//			System.out.println(friends[position]);
//			position++;
//		}
//			
//		exercise 10 (exempale) Arrays:
//			
//		String[] friends = { "Niv", "Tamir", "Amit", "Yuval" };
//
//		for (int i = 0; i < friends.length; i++) {
//			System.out.printf("the name is:%s, the position is:%d\n", friends[i], i);
//
//		}

		String[] friends = { "Yuval", "Tamir", "Amit", "Niv" };

		for (String friend : friends) {
			System.out.printf("%s,%s\n", friend, friend.equals("Tamir") ? "melech!" : "nice name..");
		}

	}

}
