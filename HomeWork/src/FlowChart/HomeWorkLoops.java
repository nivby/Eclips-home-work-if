package FlowChart;

public class HomeWorkLoops {

	public static void main(String[] args) {

//		exercise 4 page 26:
//		
//		int den = 1;
//		int max = 16;
//
//		for (int i = 1; i < max; i++) {
//			if (i % den != 0) {
//				i++;
//				continue;
//
//			}
//
//			System.out.println(i);
//			i++;
//		}
//
//      exercise 8 page 26: 
//		
//		int random = (int) (Math.random() * 20) - 10;
//
//		int min = random;
//
//		while (random > 0) {
//			if (random < min) {
//				min = random;
//
//			}
//			if (min > 0) {
//				System.out.printf("lowest:%d\n", min);
//			}
//
//		}
//		System.out.println("no valuse");

//		exercise 12 page 26:
//		
//		int random = (int) (Math.random() * 1000) + 1;
//
//		int sum = 0;
//		int SumNum = 0;
//
//		System.out.printf("the number is:%d\n", random);
//
//		while (random != 0) {
//			SumNum = (random % 10);
//			sum = (sum + SumNum);
//			random = ((int) random / 10);
//
//		}
//
//		System.out.printf("the sum of number is:%d\n", sum);
//
//		
//		exercise 13 page 26:
//		
//		int X = (int) (Math.random() * 1000000) + 1;
//		int dig = (int) (Math.random() * 10) + 1;
//		int counter = 0;
//
//		while (X > 0) {
//			if (X % 10 == dig) {
//				counter++;
//			}
//			X = (int) (X / 10);
//		}
//
//		System.out.printf("the number of dig in the number X is:%d", counter);

//		exercise 14 page 26:
//		
//		int val = (int) (Math.random() * 1000) + 1;
//
//		int lav = 0;
//		while (val != 0) {
//			int dig = val % 10;
//			lav = lav * 10;
//			lav = lav + dig;
//			System.out.println(val);
//			val = (int) val / 10;
//		}
//		System.out.println(lav);
//

//		exercise 21 page 26:
//
//		int index = (int) (Math.random() * 100) + 2;
//		int fb1 = 1;
//		int fb2 = 1;
//
//		while (index > fb2) {
//			fb2 = (fb2 + fb1);
//			fb1 = (fb2 - fb1);
//		}
//		System.out.printf("the number is:%d, fb2=%d\n", index, fb2);
//
//	
//		int num = (int) (Math.random() * 100) + 2;
//		int counter = 0;
//		int exit = 0;
//
//		while (exit == 0) {
//
//			int floor = 2;
//
//			while (num % floor != 0) {
//				floor++;
//			}
//			if (floor == num) {
//				exit = 1;
//			} else {
//				counter++;
//				int num2 = (int) (Math.random() * 100) + 2;
//			}
//		}
//		System.out.println(counter);
	}

}