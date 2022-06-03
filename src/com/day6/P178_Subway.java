package com.day6;

public class P178_Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public P178_Subway (String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "���Դϴ�.");
	}

}
