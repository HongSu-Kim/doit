package com.day13;

import java.io.IOException;

public class P324_SchadulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("전화 상담 방식을 선택하세요");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고있거나 대기가 가장적은 삼담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");

		int ch = System.in.read();
		P322_Scheduler scheduler; // P322_Scheduler타입의 변수 scheduler를 생성(null값을 가짐)

		if (ch == 'R' || ch == 'r')
			scheduler = new RoundRobin(); // scheduler에 RoundRobin타입의 값을 넣음, upcast
		else if (ch == 'L' || ch == 'l')
			scheduler = new LeastJob();
		else if (ch == 'P' || ch == 'p')
			scheduler = new PriorityAlloction();
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}

		scheduler.getNextCall(); // interface를 implements하면서 override된 메소드를 사용한다.
		scheduler.sendCallToAgent();

	}

}
