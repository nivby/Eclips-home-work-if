package Examples;

public class Switch {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 10) + 1;

		switch (random) {
		case 1:
		case 3:
			System.out.printf("1 - 3 (%d)", random);
			break;
		case 4:
			System.out.println("is 4");
			break;
		case 5:
			System.out.println("is 5");
			break;
		case 6:
			System.out.println("is 6");
			break;
		case 7:
			System.out.println("is 7");
			break;
		case 8:
			System.out.println("is 8");
			break;
		case 9:
			System.out.println("is 9");
			break;
		default:
			System.out.println("is " + random);

		}
	}

}
