package simple;

import java.util.Arrays;

public class BubbleSorted_1 {
	public static void main(String[] args) {
		int[] mass = {7, 3, 9, 4, 5, 6};
		BubbleSorted_1.sort(mass);
		System.out.println(Arrays.toString(mass));
		BubbleSorted_1.sort2(mass);
		System.out.println(Arrays.toString(mass));

	}

	public static void sort(int[] arr) {
		for (int barrier = arr.length -1; barrier >= 0; barrier--) {
			for (int index = 0; index < barrier; index++) {
				if (arr[index] > arr[index + 1]) {
					int tmp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = tmp;
				}
			}
		}
	}
	public static void sort2(int[] arr) {
		for (int barrier = 0; barrier < arr.length - 1; barrier++) {
			for (int index = arr.length - 2; index >= barrier; index--) {
				if (arr[index] > arr[index + 1]) {
					int tmp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = tmp;
				}
			}
		}
	}
}
