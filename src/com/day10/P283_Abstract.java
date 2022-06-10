package com.day10;

// Abstract class(�߻� Ŭ����)
// Abstract class�� ������ �Ұ����ϴ�.
// �߻�޼ҵ带 �����ϰ��־ ����Ŭ�������� �߻�޼ҵ带 ������ �־���Ѵ�.

// �߻� Ŭ����
abstract class Computer {
	
	// �߻� �޼ҵ�
	public abstract void display();
	public abstract void typing();

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}

class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}

}

abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}

}

class MyNoteBook extends NoteBook {

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}

}

public class P283_Abstract {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Abstract class�� ������������ �޼ҵ�(�߻�޼ҵ�)�� �����ϱ⶧���� ������ �Ұ����ϴ�.
//		Computer c1 = new Computer();
		Computer c2 = new Desktop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
			
	}

}
