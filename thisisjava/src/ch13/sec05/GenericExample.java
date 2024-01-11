package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		//모든 사람이 신청 가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		//학생만 신청 가능
		//Course.registerCourse2(new Applicant<Person>(new Person()));
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		//직장인 및 일반인만 신청 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		// 고등학생과 부모 클래스들만 등록가능
		Course.registerCourse4(new Applicant<Person>(new Person()));
		//Course.registerCourse4(new Applicant<Worker>(new Worker()));
		Course.registerCourse4(new Applicant<Student>(new Student()));
		Course.registerCourse4(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse4(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

	}

}
