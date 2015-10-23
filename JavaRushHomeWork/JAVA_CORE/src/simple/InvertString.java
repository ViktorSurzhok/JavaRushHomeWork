package simple;

/**
 * Created by viktorsurzok on 23.10.15.
 */
public class InvertString {
	public static void main(String[] args) {
		String string = "qwerty";
		System.out.println(string);
		InvertString.invert(string);
		System.out.println(string);
	}

	public static String invert(String arg) {
		char[] data = arg.toCharArray();
		for (int i = 0; i < data.length / 2; i++) {
			char tmp = data[i];
			data[i] = data[data.length - 1 - i];
			data[data.length - 1 - i] = tmp;
		}
		return new String(data);
	}
}
