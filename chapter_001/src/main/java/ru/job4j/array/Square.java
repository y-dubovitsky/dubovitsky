package ru.job4j.array;

public class Square {
	public int[] calculate(int bound) {
     int[] rst = new int[bound];
     // заполнить массив через цикл элементами от 1 до bound возведенные в квадрат
		for(int i = 0; i < bound; i++) {
			rst[i] = (int) Math.pow(i, 2);
		}
    return rst;
	}
}