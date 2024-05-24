package com.StudentDeatails;

import java.util.List;

public interface studentservice {
    public List<studentdetails> getAllStudent();
    public String getStudent(int studId);
    public String createStudent(studentdetails student);
    public String updateStudent(studentdetails student);
    public String deleteStudent(int studId); 
    
}