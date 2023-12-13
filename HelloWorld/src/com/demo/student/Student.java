package com.demo.student;

public class Student {

	private String name;
	private int age;
	private int grade;
	
	
	
	
	public Student() {
		
	}

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}



	public void displayStudentInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student age: " + age);
		System.out.println("Student grade: " + grade);
		
	}
}
