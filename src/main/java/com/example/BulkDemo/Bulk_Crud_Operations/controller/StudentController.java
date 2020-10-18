package com.example.BulkDemo.Bulk_Crud_Operations.controller;

import com.example.BulkDemo.Bulk_Crud_Operations.model.Student;
import com.example.BulkDemo.Bulk_Crud_Operations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        Student createResponse = studentService.save(student);
        return createResponse;
    }

    @PostMapping("/bulkcreate")
    public List<Student> createStudents(@RequestBody List<Student> students){
        List<Student> createResponse = studentService.saveAll(students);
        return createResponse;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        Student updateResponse = studentService.save(student);
        return updateResponse;
    }

    @PutMapping("/bulkupdate")
    public List<Student> updateStudent(@RequestBody List<Student> students){
        List<Student> updateResponse = studentService.updateAll(students);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        Student getResponse =  studentService.get(id);
        return getResponse;
    }

    @GetMapping("/allstudents")
    public List<Student> getStudents(){
        List<Student> getResponse =  studentService.getAll();
        return getResponse;
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Student student){
        studentService.delete(student);
        return "Record Deleted Successfully";
    }

    @DeleteMapping("/bulkdelete")
    public String deleteStudent(@RequestBody List<Student> student){
        studentService.deleteAll(student);
        return "Records Deleted Successfully";
    }
}
