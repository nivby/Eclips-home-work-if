package HomeWorkJavaBasic;

public class exerciseLoopsHomeWork {

	public static void main(String[] args) {

//		exercise 1:
//		int random = (int) (Math.random() * 20);
//		int num = 1;
//
//		while (num < random) {
//			System.out.printf("random number is:%d\n num number is:%d\n", random, num);
//			num++;
//
//		}

//		exercise 2:
//
//		int max = (int) (Math.random() * 20);
//		int min = (int) (Math.random() * 20);
//		int temp = 0;
//
//		if (max < min) {
//			temp = max;
//			max = min;
//			min = temp;
//		}
//
//		for (int i = min; i < max; i++) {
//
//			System.out.printf("the max is:%d\nthe min is:%d\n the index is:%d\n"
//					, max, min, i);
//
//		}

//		exercise 3:
//
//		int num = (int) (Math.random() * 20);
//
//		for (int i = 0; i < num; i++) {
//
//			if (i % 2 != 0) {
//				i++;
//			}
//			System.out.printf("the num is:%d\nthe index is:%d\n", num, i);
//		}

//		exercise 4:
//
//		int max = (int) (Math.random() * 20);
//		int den = (int) (Math.random() * 20);
//		int temp = 0;
//		int num = 1;
//
//		if (max < den) {
//			temp = max;
//			max = den;
//			den = temp;
//		}
//
//		while (max >= num) {
//			if (num % den == 0) {
//				System.out.println(num);
//			}
//			num++;
//		}
//		System.out.printf("max:%d\nden:%d\ntemp:%d\n", max, den, temp);

//	exercise 5:
//
//		int num = (int) (Math.random() * 10000);
//		int counter = 0;
//		int sum = 0;
//		int mun = 0;
//		int mun1 = num;
//		int x = 0;
//		int y = 0;
//		int FirstNum = num;
//
//		while (num != 0) {
//			x = num % 10;
//			sum = sum + x;
//			num = (int) num / 10;
//			counter++;
//		}
//		System.out.printf("the num:%d\nthe sum:%d\nnum of digits:%d\n", num, sum, counter);
//		while (FirstNum > 10) {
//			FirstNum = (int) FirstNum / 10;
//		}
//		System.out.println("the first left digits is:" + FirstNum);
//		while (mun1 != 0) {
//			y = mun1 % 10;
//			mun = mun * 10;
//			mun = mun + y;
//			mun1 = (int) mun1 / 10;
//		}
//		System.out.println(mun);

//		exercise 10 7-Boom:
//
//		int random = (int) (Math.random() * 100) + 1;
//		int temp = random;
//		int temp2 = 0;
//
//		while (temp > 0) {
//			temp = temp % 10;
//			temp2 = temp;
//			temp = (int) temp / 10;
//			if (temp2 == 7) {
//				System.out.println("Boom " + random);
//			} else if (random % 7 == 0) {
//				System.out.println("Boom " + random);
//			} else {
//				System.out.println(random);
//			}
//		}

	}
}
