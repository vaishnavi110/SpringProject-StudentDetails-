package com.StudentDeatails;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentserviceimplementation implements studentservice{

    studentdetailsrepo repo;
    
    public studentserviceimplementation(studentdetailsrepo repo) {
        this.repo = repo;
    }

    @Override
    public String createStudent(studentdetails student) {
        repo.save(student);
        return "created";
    }

    @Override
    public String deleteStudent(int studId) {
        repo.deleteById(studId);
        return "deleted";
    }

    @Override
    public String getStudent(int studId) {
      repo.findById(studId).orElse(null);
      return "sucess";
    }

    @Override
    public String updateStudent(studentdetails student) {
       repo.save(student);
      return "Updated";
    }

    @Override
    public List<studentdetails> getAllStudent() {
        return repo.findAll();
    }


    
}
