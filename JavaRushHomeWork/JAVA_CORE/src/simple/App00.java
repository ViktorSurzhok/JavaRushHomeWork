package simple;

import java.util.Arrays;

/**
 * Created by viktorsurzok on 23.10.15.
 */
public class App00 {
	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 3};
		int[][] arr2 = {{0, 1, 2, 3}, {0, 1, 2, 3}};

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
	}
}
