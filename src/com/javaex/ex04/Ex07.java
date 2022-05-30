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

		int ilength = iArray.length; //배열의 길이를 알고자 할때 length 사용.
		System.out.println("총 객체수: " + ilength);
		System.out.println("총 객체수: " + iArray.length);
		
		
		
		// 컬렉션 프레임워크 - List 컬렉션
		// 1. ArrayList
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
	
		
	
	}

}
