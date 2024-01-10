package ch12.sec03.exam01;

public class Member {
	// 필드 선언
	public String id;
	
	// 생성자(매개변수 id)
	public Member(String id) {
		this.id = id;
	}

	// 메서드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// instanceof 타입비교 : obj가 Member 타입
		if(obj instanceof Member target) {  
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
	

}
