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
		String str = String.format("아이디 :%3d, 이름 :%6s", memberId, memberName);
		return str;
	}

}
