package br.com.rafaela.javaspringatv2.controller;
import java.util.List;
import java.util.Optional;

import br.com.rafaela.javaspringatv2.domain.*;
import br.com.rafaela.javaspringatv2.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student Student) {
        return studentRepository.save(Student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student Student) {
        return studentRepository.save(Student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.delete(studentRepository.findById(id).get());
    }
}