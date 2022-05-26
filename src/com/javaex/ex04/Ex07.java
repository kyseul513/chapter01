package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {

	public static void main(String[] args) {

		int[] iArray = new int[3];
			iArray[0] = 1;
			iArray[1] = 2;
			iArray[2] = 3;

		int[] jArray = new int[] { 1, 2, 3 };
		int[] kArray = { 1, 2, 3 };

		
		// 컬렉션 프레임워크 - List 컬렉션
		// 1. ArrayList
		List<String> list = new ArrayList<String>();
			list.add("Java");
			list.add("JDBC");
			
		int size = list.size();
		System.out.println("총 객체수: " + size);
	
		String skill = list.get(1);
		System.out.println("1번 인덱스: " + skill);
	
		
	
	}

}
