package com.StudentDeatails;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/studentdetails")
public class studentcontroller {
    studentservice service;
    

    public studentcontroller(studentservice service) {
        this.service = service;
    }


    @GetMapping
    public List<studentdetails> getAllStudentDetails()
    {
        return service.getAllStudent();
    }
    @GetMapping("{studId}")
    public String getStudentDetails(@PathVariable("studId")int studId)
    {
        return service.getStudent(studId);
    }
    @PostMapping
    public String createStudentDetails(@RequestBody studentdetails student)
    {
        service.createStudent(student);
        return "created successfully";
    }
    @PutMapping
    public String updateStudentDetails(@RequestBody studentdetails student)
    {
        service.updateStudent(student);
        return "updated successfully.";
    }
    @DeleteMapping("{studId}")
    public String deleteStudentDetails(@PathVariable("studId")int studId)
    {
        return service.deleteStudent(studId);
    }

    
}
