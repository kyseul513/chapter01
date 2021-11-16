package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);  //왼쪽을 오른쪽으론 나눔. 3.5 몫3 나머지 1에서 몫만 표시됨.
		System.out.println(a % b);  //나머지 표시. 몫3 나머지 1에서 나머지 1만 표시됨.
	
		
		//산술연산자 %자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0);  //실수나누기 실수니까 실수 3.5로 나옴.
		System.out.println(7.0%2.0);  //나머지 1.0 표시.
		
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;	// +(-3)이니까 -3임.
		int mVar = -var;	// -(-3)이니까 3임.
		System.out.println(pVar);
		System.out.println(mVar);
		
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);		//7
		System.out.println(++a);    //(1)a를 1올린다:7->8. (2)a를 출력한다: 8출력

		System.out.println(a);      //a 원본이 7에서 8로 진짜로바뀐건지 확인. 8이 나오니까 진짜 바뀐게 맞음.
		
		System.out.println(b);     //2
		System.out.println(--b);   //b를 1내린다:2->1. b를 출력한다.
		System.out.println(b);
		
		System.out.println(a);     //8
		System.out.println(a++);   //(1)a를 출력한다: 8 (2)a를 1올린다: 8->9
		System.out.println(a);     //9가 되었는지 확인.

		System.out.println(b);     
		System.out.println(b--);   //(1)b를 출력: 1  (2)b를 1 내린다: 1->0
		System.out.println(b);     //0이 되었는지 확인.
		
		
		
		
		
		
	}
	
}
