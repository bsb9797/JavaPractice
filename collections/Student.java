package com.maven.collections;

public class Student implements Comparable<Student>{
	private int Sid;
	private String name;
	private int marks;
	public Student(int sid, String name, int marks) {
		super();
		Sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + ", marks=" + marks + "]";
	}
//	@Override
//	public int compareTo(Student s) {
//		
//		return this.marks-s.marks;
//	}
	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);
	}
	
}
