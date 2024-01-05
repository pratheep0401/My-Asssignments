package org.Student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Pratheep");
	}
	public void studentDept() {
		System.out.println("Mechanical Dept");
	}
	public void studentId() {
		System.out.println("20LME304");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.deptName();
		obj.CollegeName();
		obj.CollegeCode();
		obj.CollegeRank();
	}
}
