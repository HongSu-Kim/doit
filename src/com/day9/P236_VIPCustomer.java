package com.day9;

public class P236_VIPCustomer extends P234_Customer { // 클래스 상속
	// 하위클래스 extends 상위 클래스
//	private int customerID; // 중복
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;

	private int agentID; // VIP 기능 구현에 필요
	double saleRatio;

	public P236_VIPCustomer() { // 디폴트 생성자
		// super(); // 상위 클래스(P234_Customer)를 자동으로 호출
		setCustomerGrade("VIP");
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public P236_VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		setCustomerGrade("VIP");
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	// 오버라이딩 : 재정의
	@Override // 애노테이션, 오버라이딩된 메소드임을 표시해줌
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // 할인율 적용
	}

	public int getAgentID() { // VIP고객한테만 필요
		return agentID;
	}

	// customerName은 private이기 때문에 set()메소드를 호출한다.
	// bonusPoint는 default이기 때문에 사용가능
	public String showCustomerInfo() {
		return getCustomerName() + "님의 등급은 " + getCustomerGrade() + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원은 아이디는 " + agentID + "입니다";
	}

}
