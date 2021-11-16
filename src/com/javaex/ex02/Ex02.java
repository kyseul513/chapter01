package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//system.in은 키보드처럼 생각. Scanner은 입력값을 읽어오는 것. sc는 키보드의 이름.
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();						// 사용자가 입력한 정수를 받겠다.
		System.out.println("입력하신 숫자는 " + num + " 입니다.");
		
		
		sc.close(); 			// 끝에 닫아주는거. 키보드와 연결을 끊는 개념.
		}
}
