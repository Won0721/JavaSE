package Student;

import section10.access2.Pet;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentA = new Student();
		Student studentB = new Student();
		System.out.println(studentA.studentID);
		System.out.println(studentB.studentID);
		
		Pet dog1 = new Pet("멍멍이");
		
		dog1.eat();
	}

}
