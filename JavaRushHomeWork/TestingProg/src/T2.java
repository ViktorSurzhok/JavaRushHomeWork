import java.util.Arrays;

/**
 * Created by viktorsurzok on 17.10.15.
 */
public class T2 {
	public static void main(String[] args) {
		int massSize = 10;
		int roundSize = 50;
		int[] mass = new int[massSize];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) Math.round(Math.random() * roundSize);
		}
		System.out.println(Arrays.toString(mass));
		T2.invert(mass);
		System.out.println(Arrays.toString(mass));
		T2.sortMaxToMin(mass);
		System.out.println(Arrays.toString(mass));
		T2.sortMinToMax(mass);
		System.out.println(Arrays.toString(mass));
	}

	public static void invert(int[] mass) {
		for (int i = 0; i < mass.length / 2; i++) {
			int tmp = mass[i];
			mass[i] = mass[mass.length - 1 - i];
			mass[mass.length - 1 - i] = tmp;
		}
	}

	public static void sortMaxToMin(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			int max = mass[i];
			int imax = i;

			for (int j = i + 1; j < mass.length; j++) {
				if (max < mass[j]) {
					max = mass[j];
					imax = j;
				}
				if (i != imax) {
					int tmp = mass[i];
					mass[i] = mass[imax];
					mass[imax] = tmp;
				}
			}
		}
	}

	public static void sortMinToMax(int[] mass) {
		for (int i = 0; i < mass.length; i++) {
			int min = mass[i];
			int imin = i;
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[j] < min) {
					min = mass[j];
					imin = j;
				}
			}
			if (i != imin) {
				int temp = mass[i];
				mass[i] = mass[imin];
				mass[imin] = temp;
			}
		}
	}
}
