package org.student;

import org.department.Department;

public class Student extends Department{
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.department();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
	}

	private void studentId() {
		System.out.println("Student ID: 9387938");
		
	}

	private void studentDept() {
		System.out.println("EEE");
		
	}

	private void studentName() {
		System.out.println("Charan Raj Baskaran");
		
	}

}
