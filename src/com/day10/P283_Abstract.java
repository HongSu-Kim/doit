package com.day10;

// Abstract class(추상 클래스)
// Abstract class는 생성이 불가능하다.
// 추상메소드를 포함하고있어서 하위클래스에서 추상메소드를 구현해 주어야한다.

// 추상 클래스
abstract class Computer {
	
	// 추상 메소드
	public abstract void display();
	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
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

		// Abstract class는 구현되지않은 메소드(추상메소드)가 존재하기때문에 생성이 불가능하다.
//		Computer c1 = new Computer();
		Computer c2 = new Desktop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
			
	}

}
