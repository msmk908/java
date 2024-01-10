package ch12.sec03.exam02;

public class Student {
	// 필드
	private int no;
	private String name;
	
	// 생성자 : 매개변수 2개로 객체
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}

	/*
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	*/

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}
