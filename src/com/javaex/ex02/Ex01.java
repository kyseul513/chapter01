package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
	
		// println() print() 차이점	
		System.out.print("안녕");		//ln이 없으면 입력된 마지막 글자에서 대기.(줄바꿈x)
		System.out.println("하세요");
		System.out.println("안녕하세요");		//ln이 있으면 줄바꿈o
		
		
		
		//println() 사용법
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "강예슬";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println(i);
		System.out.println(d);
		
		System.out.println(str+str); 		// 굿모닝굿모닝 문자를 붙여서 표현함.
		System.out.println(str+i); 			// 굿모닝2345
		System.out.println(str+d); 			// 굿모닝3.14
		System.out.println(str+c); 			// 굿모닝한
		
		System.out.println(str+" 이랑 "+i);	//굿모닝 이랑 2345
		
		System.out.println(i+i); 			// 2345+2345형태로 계산된 값 4690이 나옴.
		System.out.println(i+d); 			// i가 실수로 자동형변환된 후 계산. 2318.14
		System.out.println(i-i); 			// 0
		
		System.out.println(c+c); 			// char은 코드값을 더한게 나옴. 109240
		System.out.println(c+s); 			// 이때는 문자로 나옴. 한한

		
		System.out.println("제이름은 "+name+" 입니다.");	// 제이름은 강예슬 입니다.
		System.out.println("안녕\"하\"세요");				//안녕"하"세요. \"사용.
		System.out.println("안녕\\하\\세요"); 				//안녕\하\세요
		System.out.println("안녕'하'세요"); 				//안녕'하'세요
		System.out.println("안녕\t하세요"); 				//tab. 안녕	하세요
		System.out.println("안녕\n하세요"); 				//줄바꿈
		
		
		
		
		
		
		
	}
}
