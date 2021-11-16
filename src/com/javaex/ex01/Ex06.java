package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4;		// 정수 나누기 정수는 정수로 표시. 따라서 몫이 1이라 1.0으로 표시됨.
		System.out.println(v01);
		
		double v02 = (double)5/4;		//실수와 정수중에서는 실수가 이김... 그래서 실수로 표시됨. (double)5는 5.0을 의미.
		System.out.println(v02);		//(d)5/4 -> 5.0/4 -> 5.0/4.0 ->1.25
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		
		double v05 = (int)1.3+(int)1.8;
		System.out.println(v05);
		
		int v06 = (int)(1.3+1.8);		//(int)3.1 -> 3으로 출력.
		System.out.println(v06);
		
		
	}


}
