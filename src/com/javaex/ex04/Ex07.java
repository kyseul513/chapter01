package com.javaex.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex07 {

	public static void main(String[] args) {

		int[] iArray = new int[3];
			iArray[0] = 1;
			iArray[1] = 2;
			iArray[2] = 3;

		int[] jArray = new int[] { 1, 2, 3 };
		int[] kArray = { 1, 2, 3 };

		int ilength = iArray.length; //배열의 길이를 알고자 할때 length 사용.
		System.out.println("총 객체수: " + ilength);
		System.out.println("총 객체수: " + iArray.length);
		
		
		
		// 컬렉션 프레임워크 - List 컬렉션
		// 1-1. ArrayList
		// 저장공간을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어남.
		List<String> list = new ArrayList<String>();
			list.add("Java");
			list.add("JDBC");
			
		int size = list.size();	//컬렉션프레임워크 타입의 길이를 알고자 할때 size 사용.
		System.out.println("총 객체수: " + size);
		System.out.println("총 객체수: " + list.size());
		
		
		String skill = list.get(1);
		System.out.println("1번 인덱스: " + skill);
		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		// 1-2. asList
		// 고정된 객체들로 구성된 List.
		List<String> alist1 = Arrays.asList("Java", "JDBC");
		for(String name: alist1) {
			System.out.println("alist1: "+name);
		}
		
		
		List<Integer> alist2 = Arrays.asList(1, 2, 3);
		for(int number: alist2) {
			System.out.println("alist2: "+number);
		}
		
	
	}

}
