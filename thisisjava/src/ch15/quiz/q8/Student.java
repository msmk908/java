package ch15.quiz.q8;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			return target.studentNum == studentNum;
		}else {
			return false;
		}
	}
}
