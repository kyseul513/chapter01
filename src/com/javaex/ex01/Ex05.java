package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
	
		System.out.println(2+3.4);	//계산값 출력
		System.out.println("2+3.4");	//글자 그대로 출력
		
		//자동형변환
		double var01 = 2+3.4;	//2.0(자동형변환) + 3.4 //float, double 두개 다 사용가능.
		System.out.println(var01);
		
		
		//자동형변환(long + float)
		long var02 = 12345L;
		float var03 = 1.1F;
		System.out.println(var02+var03);	//계산하는 순간에 var02가 자동을 바뀜.
		
		
		float result = var02+var03;
		System.out.println(result);
		
		
		////////////////////////////////////////////////////
		
		
		//강제형변환
		int i = (int)11112.3232322;		//double을 int에 담아야 하는 경우 (int)로 쓰면 형변환이 됨
		System.out.println(i);			//소수점을 버린 int형태로 출력됨.
		
		float f01 = 12.5f;
		int i01 = (int)f01;		//int에 12.5를 넣겠다
		System.out.println(i01);
		System.out.println(f01);
		
		
		//강제형변환 > 확대 형변환 (작은거->큰거)
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v02);	//v01, v02 모두 10으로 출력.
		
		
		//강제형변환 > 축소 형변환 (정상)
		int v03 = 10;		//4byte => 32bit
		byte v04 = (byte)v03;
		System.out.println(v03);
		System.out.println(v04);	// 다행인 경우. (축소해도 자료를 잃지 않으니까....)
		
		
		//강제형변환 > 축소 형변환 (비정상)
		int v05 = 34324324;
		byte v06 = (byte)v05;
		System.out.println(v05);	// 34324324 그대로 출력
		System.out.println(v06);	// 100 자료 소실
		
		
		//실수 > 정수 : 소수부분이 없어짐.
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);	//소수점을 버린 5 출력
		
		
		//정수 > 실수 : .0이 형태로 출력.
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);	// 실수 7.0으로 출력
		
		
		
		
	}
}
