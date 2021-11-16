package com.javaex.ex01;

public class Ex03 {

	public static void main(String[] args) {
		
		// char은 1글자만 입력가능. 글자는 '' 사이에 입력해야함. 
		// '1'은 문자 1 따라서 char에 해당. 1은 숫자 1 따라서 int에 해당함.
		char ch01 = 'A';
		char ch02 = 65;		//코드값으로 인식해서 해당되는 알파벳 A 출력
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		
		
		boolean b01 = true;		//단어가 아니고 정의된 값.
		boolean b02 = false;
		
		System.out.println(b01);	//출력된 것은 true라는 단어가 아니고 값.
		System.out.println(b02);
		
		
		
		int a = 3;
		int b = 5;
		boolean result = a>b;		//해당식이 참인지 거짓인지 판별.
		
		System.out.println(result);		//판별 후 true인지 false인지 출력
		
		
		
		char st = '안';			// char은 1글자만 입력가능. 글자는 '' 사이에 입력해야함. 
		String str = "안"; 		//string은 여러글자 입력 가능. 한글자만 넣어도 ""를 써야함.
		String str2 = "안녕하세요"; 
		
		System.out.println(st);
		System.out.println(str);
		System.out.println(str2);
		
	}
}
