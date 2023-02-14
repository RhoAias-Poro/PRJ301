package model;
import java.util.*;
import java.sql.*;

public class StudentDAO extends MyDAO {

  public List<Student> getStudents() {
    List<Student> t = new ArrayList<>();
    xSql = "select * from Student";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      String xRollno,xName,xFOO; float xMark;
      Student x;
      while(rs.next()) {
        xRollno = rs.getString("rollno");  
        xName = rs.getString("name");  
        xMark = rs.getFloat("mark");
        xFOO = rs.getString("FOO");
        x = new Student(xRollno,xName,xMark,xFOO);
        t.add(x);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }
  public List<Student> getStudents(String xFOO) {
    List<Student> t = new ArrayList<>();
    xSql = "select * from Student WHERE FOO like '%" + xFOO + "%'";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      String xRollno,xName; float xMark;
      Student x;
      while(rs.next()) {
        xRollno = rs.getString("rollno");  
        xName = rs.getString("name");  
        xMark = rs.getFloat("mark");
        xFOO = rs.getString("FOO");
        x = new Student(xRollno,xName,xMark,xFOO);
        t.add(x);
      }
      rs.close();
      ps.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
    return(t);
  }


}
