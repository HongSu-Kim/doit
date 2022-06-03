package com.day6;

public class P177_Bus {
	int busNumber;
	int passengerCount;
	int money;

	public P177_Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "���Դϴ�.");
	}

}
