package model;

public class Student {

	private String rollno, name;
	private float mark;
	private int THU;

	public int getTHU() {
		return THU;
	}

	public void setTHU(int THU) {
		this.THU = THU;
	}

	public Student() {
	}

	public Student(String rollno, String name, float mark, int THU) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
		this.THU = THU;
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

}
