package com.javaex.ex02;

import java.util.Scanner;			// ctrl+shift+o

public class Ex03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		// new Scanner(System.in): 메모리에 Scanner라는 애를 올리라는 뜻.
		// Scanner sc: 스캐너 별명
	
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();			//String으로 문자열 입력할거면 nextLine으로.
		System.out.println("당신의 이름은 " + name + " 입니다.");
	
		
		sc.close();
	}
}
