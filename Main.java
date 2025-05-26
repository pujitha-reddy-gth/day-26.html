package com.main1;


import com.school.School;
import com.student.Student;

public class Main {
public static void main(String []args) {
	System.out.println("School");
	School school=School.getSchoolObject("Starenglisg", "ongole", "good company");
	Student student=Student.getStudentObject("pujitha", "11th", school, 72);
	System.out.println(school);
	System.out.println();
	System.out.println("---Student Details---");
	System.out.println(student);
	System.out.println();
	School school1=School.getSchoolObject(null, null, null);
	Student student1=Student.getStudentObject(null, null, school1, 0);
	System.out.println(student1);
	
}
}