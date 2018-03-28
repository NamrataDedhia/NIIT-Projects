package DAOExample;


import java.util.List;

public abstract interface StudentDAO
{
  public abstract List<Student> getAllStudents();
  
  public abstract Student getStudent(int paramInt);
  
  public abstract void updateStudent(Student paramStudent);
  
  public abstract void deleteStudent(Student paramStudent);

}