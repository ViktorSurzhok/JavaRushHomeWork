package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//Напишите тут ваш код
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String a = bufferedReader.readLine();
		int a1 = Integer.parseInt(a);
		String b = bufferedReader.readLine();
		int b1 = Integer.parseInt(b);
		String c = bufferedReader.readLine();
		int c1 = Integer.parseInt(c);
		String d = bufferedReader.readLine();
		int d1 = Integer.parseInt(d);

		int max = Math.max(Math.max(c1, d1), Math.max(a1, b1));
		System.out.println(max);

	}
}
