package com.day14;

public class P407_MemberVO {

	private int memberId;
	private String memberName;
	private static int ID;

	public P407_MemberVO() {
		ID++;
		memberId = ID;
	}

	public int getMemberId() {
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

}
