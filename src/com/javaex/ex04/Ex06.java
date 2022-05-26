package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if ((i % 6 == 0) && (i % 14 == 0)) {
				System.out.println(i);

				break;
			}
		}

	}

}
