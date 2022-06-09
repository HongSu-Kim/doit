package com.day9;

public class P239_CustomerTest {

	public static void main(String[] args) {

		P234_Customer customerLee = new P234_Customer();

		customerLee.setCustomerID(10010); // customerID는 private이기 때문에 set()메소드를 호출한다.
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000; // bonusPoint는 default이기 때문에 사용가능

		System.out.println(customerLee.showCustomerInfo());

//		P236_VIPCustomer customerKim = new P236_VIPCustomer();
		P234_Customer customerKim = new P236_VIPCustomer();
		// [상위클래스 변수명 = new 하위클래스]와 같은 형태로도 선언할수있다.
		// 이 경우 상위클래스의 멤버변수와 메소드만 호출 가능하다.
		// 오버라이딩한 경우 오버라이딩된 변수,메소드를 호출한다.
		
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;

		System.out.println(customerKim.showCustomerInfo());

	}

}
