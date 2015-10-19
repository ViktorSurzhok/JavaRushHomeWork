/**
 * Created by viktorsurzok on 17.10.15.
 */
public class T2 {
	public static void main(String[] args) {
		int[] mass = new int[5];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) Math.round(Math.random()*50);
		}
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
	}
}
