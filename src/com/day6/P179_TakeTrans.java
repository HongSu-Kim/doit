package com.day6;

public class P179_TakeTrans {

	public static void main(String[] args) {
		
		P175_Student studentJames = new P175_Student("James", 10000);
		P175_Student studentTomas = new P175_Student("Tomas", 15000);
		
		P177_Bus bus100 = new P177_Bus(100);
		P178_Subway subwayGreen = new P178_Subway("2È£¼±");
		
		studentJames.takeBus(bus100);
		studentTomas.takeSubway(subwayGreen);
		studentTomas.takeBus(bus100);
		
		studentJames.showInfo();
		studentTomas.showInfo();
		bus100.showInfo();
		subwayGreen.showInfo();

	}

}
