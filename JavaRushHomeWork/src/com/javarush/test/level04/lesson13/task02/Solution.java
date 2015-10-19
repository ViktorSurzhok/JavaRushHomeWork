package com.javarush.test.level04.lesson13.task02;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//Напишите тут ваш код
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String stringOne = bufferedReader.readLine();
		String stringTwo = bufferedReader.readLine();
		int countOne = Integer.parseInt(stringOne);
		int countTwo = Integer.parseInt(stringTwo);
	}
}
