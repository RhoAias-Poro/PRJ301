package model;

public class Student {
  private String rollno,name,FOO;
  private float mark;

    public Student() {
    }

    public Student(String rollno, String name, float mark, String FOO) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
        this.FOO = FOO;
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

    public String getFOO() {
        return FOO;
    }

    public void setFOO(String FOO) {
        this.FOO = FOO;
    }
  
}
