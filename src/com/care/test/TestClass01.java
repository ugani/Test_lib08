package com.care.test;

public class TestClass01 {

	public static void main(String[] args) {
		MemberClass m = new MemberClass();
		//첫번째 글자가 대문자인것들은 클래스!!
		//m은 참조형 변수,참조를 하는 객체가 있음
		m.name = "홍길동";
		m.age = 20;
		System.out.println("이름 :" +m.name);
		System.out.println("나이 :" +m.age);
		
		
		


	}

}
