package edu.kh.oarr.model.vo.model;

public class Member {
	
	// 필드 == 멤버변수(인스턴스 변수, 클래스 변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	
	
	// 생성자
	// 생성자 규칙 -  클래스 명과 같아야한다!!!!!
	// 			   반환형이 없다.
	
	
	
	// 메서드
	
	
	public Member() { // 기본 생성자
		
	}
	
	// 매개 변수 생성자
	
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	
	
	
	
	
	// getter / setter
	
	
	
	
	/* 다 접근 가능하도록 public
	 * String 자료형으로 돌려보내겠다.
	 * 매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 memberId라고만 써도 ok
	 */
	public String getMemberId() { // 퍼블릭 -> 스트리형 자료형으로 -> 위에있는 멤버ID로 돌려주겠다 --
		return memberId;
	}

	public void setMemberId(String memberId) {
		/* setter는 말 그대로 셋팅하는 애
		 * 무엇을 셋팅할지 전달 받아올 아이가 필요하다 그 아이가 매개변수
		 * setter는 보통 반환 값이 없다. => void
		 */
		this.memberId = memberId;
		// return; 가 사실 있다.
		// 모든 매서드는 종료 시 호출한 곳으로 돌아가는 return구문이 작성되어야 하지만
		// 단 void일 때만 안적어도됨.
		// 생략 시, 눈에 안보이게 컴파일러가 return;을 적어줌.
		
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	
	
	
	
	
	
	

}
