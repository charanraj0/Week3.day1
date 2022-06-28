package org.department;

import org.college.College;

public class Department extends College{
	public static void main(String[] args) {
		Department dept = new Department();
		dept.department();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
	}
	public void department() {
		System.out.println("Electrical and Electronics Engineering");
		
	}

}
