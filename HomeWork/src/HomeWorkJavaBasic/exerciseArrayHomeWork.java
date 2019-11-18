package HomeWorkJavaBasic;

public class exerciseArrayHomeWork {

	public static void main(String[] args) {

//		exercise 1:
//		
//		int[] RandArray = new int[10];
//
//		for (int i = 0; i < RandArray.length; i++) {
//			RandArray[i] = (int) (Math.random() * 100);
//		}
//		System.out.println(Arrays.toString(RandArray));

//		exercise 2:
//
//		int[] randArrya = new int[50];
//
//		for (int i = 0; i < randArrya.length; i++) {
//			randArrya[i] = (int) (Math.random() * 100);
//
//		}
//
//		int max = 0;
//		int counter = 0;
//		int Index = 0;
//
//		for (int i : randArrya) {
//			if (i > max) {
//				max = i;
//				Index = counter;
//			}
//			counter++;
//		}
//		System.out.println(Arrays.toString(randArrya));
//		System.out.printf("max number:%d\nindex number:%d", max, Index);

//		exercise 3:
//
//		int[] numArrays = new int[10];
//
//		for (int i = 0; i < numArrays.length; i++) {
//			numArrays[i] = (int) (Math.random() * 10) + 1;
//		}
//		System.out.println(Arrays.toString(numArrays));
//
//		for (int i = 0; i < numArrays.length; i++) {
//			for (int j = i + 1; j < numArrays.length; j++) {
//				if (numArrays[i] > numArrays[j]) {
//					int temp = numArrays[j];
//					numArrays[j] = numArrays[i];
//					numArrays[i] = temp;
//				}
//			}
//		}
//		int[] uniqe = new int[numArrays.length];
//
//		int prev = numArrays[0];
//		uniqe[0] = prev;
//
//		int count = 1;
//		for (int i = 1; i < numArrays.length; i++) {
//			if (numArrays[i] != prev) {
//				uniqe[count] = numArrays[i];
//				count++;
//			}
//			prev = numArrays[i];
//
//		}
//		System.out.println(Arrays.toString(uniqe));
//
//		int[] FinallyArrays = new int[count];
//		System.arraycopy(uniqe, 0, FinallyArrays, 0, count);
//		System.out.println(Arrays.toString(FinallyArrays));

//		exercise 3 one more resulte:
//
//		int[] randArray = new int[10];
//		for (int i = 0; i < randArray.length; i++) {
//			randArray[i] = (int) (Math.random() * 10) + 1;
//		}
//
//		System.out.println(Arrays.toString(randArray));
//
//		int[] noDuplicates = Arrays.stream(randArray).distinct().toArray();
//		System.out.println(Arrays.toString(noDuplicates));
	}

}
