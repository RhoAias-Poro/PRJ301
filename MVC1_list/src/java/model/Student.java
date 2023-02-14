package model;

public class Student {

	private String rollno, name;
	private float mark, AB;

	public Student() {
	}

	public Student(String rollno, String name, float mark, float AB) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
		this.AB = AB;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public String getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public float getMark() {
		return mark;
	}

	public float getAB() {
		return AB;
	}

	public void setAB(float AB) {
		this.AB = AB;
	}
}
