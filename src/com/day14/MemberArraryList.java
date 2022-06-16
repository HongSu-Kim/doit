package com.day14;

import java.io.IOException;

public interface MemberArraryList {

	public int input(int n) throws IOException; // input값 확인

	public void printHome() throws IOException; // home 출력

	public void addMember() throws IOException; // 회원가입

	public void removeMember() throws IOException; // 탈퇴

	public void printMemberImfo() throws IOException; // 회원정보출력

	public void search() throws IOException; // 검색

	public void sort(); // 정렬

}
