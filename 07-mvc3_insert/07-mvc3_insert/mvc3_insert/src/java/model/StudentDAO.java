package model;

import java.util.*;
import java.sql.*;

public class StudentDAO extends MyDAO {

	public List<Student> getStudents() {
		List<Student> t = new ArrayList<>();
		xSql = "select * from Student";
		String xRollno, xName;
		float xMark;
		int xTHU;
		Student x;
		try {
			ps = con.prepareStatement(xSql);
			rs = ps.executeQuery();
			while (rs.next()) {
				xRollno = rs.getString("rollno");
				xName = rs.getString("name");
				xMark = rs.getFloat("mark");
				xTHU = rs.getInt("THU");
				x = new Student(xRollno, xName, xMark, xTHU);
				t.add(x);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (t);
	}

	public Student getStudent(String xRollno) {
		xSql = "select * from Student where rollno = ?";
		String xName;
		float xMark;
		int xTHU;
		Student x = null;
		try {
			ps = con.prepareStatement(xSql);
			ps.setString(1, xRollno);
			rs = ps.executeQuery();
			if (rs.next()) {
				xName = rs.getString("name");
				xMark = rs.getFloat("mark");
				xTHU = rs.getInt("THU");
				x = new Student(xRollno, xName, xMark, xTHU);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (x);
	}

	public List<Student> getStudents(String xxName) {
		List<Student> t = new ArrayList<>();
		xSql = "select * from Student where name like '%" + xxName + "%'";
		String xRollno, xName;
		float xMark;
		int xTHU;
		Student x;
		try {
			ps = con.prepareStatement(xSql);
			rs = ps.executeQuery();
			while (rs.next()) {
				xRollno = rs.getString("rollno");
				xName = rs.getString("name");
				xMark = rs.getFloat("mark");
				xTHU = rs.getInt("THU");
				x = new Student(xRollno, xName, xMark, xTHU);
				t.add(x);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (t);
	}

	public void insert(Student x) {
		xSql = "insert into Student (rollno,name,mark,THU) values (?,?,?,?)";
		try {
			ps = con.prepareStatement(xSql);
			ps.setString(1, x.getRollno());
			ps.setString(2, x.getName());
			ps.setFloat(3, x.getMark());
			ps.setInt(4, x.getTHU());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
