package com.day10;

abstract class Car {

	public abstract void drive();

	public abstract void wiper();

	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	// ���ø� �޼ҵ�
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}

}

class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("�� ���� �翡 ���� �����Ⱑ �ڵ����� �����˴ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

}

class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("����� �����⸦ �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
	}

}

public class P291_Template {

	public static void main(String[] args) {

		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car myCar = new AICar();
		myCar.run();

		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car hisCar = new ManualCar();
		hisCar.run();

	}

}
