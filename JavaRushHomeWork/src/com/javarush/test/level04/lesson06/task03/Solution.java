package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int firstNumber = Integer.parseInt(reader.readLine());
		int secondNumber = Integer.parseInt(reader.readLine());
		int thirdNumber = Integer.parseInt(reader.readLine());

		printNumbers(firstNumber, secondNumber, thirdNumber);
	}

	public static void printNumbers(int a, int b, int c) {
		int tmp;

		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if (b < c) {
			tmp = b;
			b = c;
			c = tmp;
		}

		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a + " " + b + " " + c);
	}

}
