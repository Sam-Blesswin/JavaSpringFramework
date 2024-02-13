package com.sam.springbootJDBC.service;

import com.sam.springbootJDBC.model.Student;
import com.sam.springbootJDBC.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public StudentService() {
        System.out.println("Student Service created");
    }

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public  void addStudent(Student student){
        repo.save(student);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
