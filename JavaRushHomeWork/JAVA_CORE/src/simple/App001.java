package simple;

/**
 * Created by viktorsurzok on 23.10.15.
 */
public class App001 {
	public static void main(String[] args) {
		// Обмен значениями
		int a = 3;
		int b = 5;

		int tmp = a;
		a = b;
		b = tmp;

		System.out.println(a);
		System.out.println(b);
	}
}
