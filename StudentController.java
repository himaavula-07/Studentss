package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentRepository repo;

    public StudentController(StudentRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Student> getStudents() { return repo.findAll(); }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        repo.save(student);
        return "Student added successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        repo.delete(id);
        return "Student deleted successfully";
    }
}
