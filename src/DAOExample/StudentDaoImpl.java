package DAOExample;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl
  implements StudentDAO
{
  List<Student> students;
  
  public StudentDaoImpl()
  {
    this.students = new ArrayList();
    Student student1 = new Student("Robert", 0);
    Student student2 = new Student("John", 1);
    this.students.add(student1);
    this.students.add(student2);
  }
  
  public void deleteStudent(Student student)
  {
    this.students.remove(student.getRollNo());
    System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
  }
  
  public List<Student> getAllStudents()
  {
    return this.students;
  }
  
  public Student getStudent(int rollNo)
  {
    return (Student)this.students.get(rollNo);
  }
  
  public void updateStudent(Student student)
  {
    ((Student)this.students.get(student.getRollNo())).setName(student.getName());
    System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
  }
}
