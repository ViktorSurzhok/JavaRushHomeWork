package simple;

import java.util.Arrays;

/**
 * Created by viktorsurzok on 23.10.15.
 */
public class ArrayInvert {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		ArrayInvert.invert(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void invert(int[] mass) {
		for (int i = 0; i < mass.length / 2; i++) {
			int tmp = mass[i];
			mass[i] = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = tmp;
		}
	}
}
