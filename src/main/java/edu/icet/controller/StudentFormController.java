package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("Student")
public class StudentFormController {

    private final StudentService studentService;

    @PostMapping
    public void addStudents(@RequestBody Student student) {
        studentService.addStudents(student);
    }

    @GetMapping
    public List<Student> getAll(@PathVariable Student student) {
        return studentService.getAll();
    }

    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}




