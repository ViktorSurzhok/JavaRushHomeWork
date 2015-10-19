package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		//Напишите тут ваш код
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String a = bufferedReader.readLine();
		int c = Integer.parseInt(a);
		String b = bufferedReader.readLine();
		int d = Integer.parseInt(b);

		int min;
		if (c > d) {
			min = d;
		} else min = c;
		System.out.println(min);
	}
}