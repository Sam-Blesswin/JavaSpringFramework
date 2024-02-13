package com.sam.springbootJDBC.repository;

import com.sam.springbootJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public StudentRepo() {
        System.out.println("Student Repo created");
    }

    public void save(Student student){
        String sql = "INSERT INTO students (rollNo, name, marks) VALUES (?,?,?);";
        int rows = jdbc.update(sql,student.getRollNo(),student.getName(),student.getMarks());
        System.out.println(rows+" effected");
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM students;";

        return jdbc.query(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
