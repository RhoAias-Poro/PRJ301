package model;
import java.sql.*;
import java.util.*;

public class StudentDAO extends MyDAO {
  public List<Student> getStudents() {
    List<Student> t = new ArrayList<>();
    xSql = "select * from Student1";
    try {
      ps = con.prepareStatement(xSql);
      rs = ps.executeQuery();
      String xRollno,xName; float xMark,xAB;
      Student x;
      while(rs.next()) {
        xRollno = rs.getString("rollno");  
        xName = rs.getString("name");  
        xMark = rs.getFloat("mark");
        xAB = rs.getFloat("AB");
        x = new Student(xRollno,xName,xMark,xAB);
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
