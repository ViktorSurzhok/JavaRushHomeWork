import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by viktorsurzok on 16.10.15.
 */
public class T1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s1 = bufferedReader.readLine();
		int s2 = Integer.parseInt(bufferedReader.readLine());
		System.out.println(s1 + " " + s2);
	}
}
