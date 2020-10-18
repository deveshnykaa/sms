package com.example.BulkDemo.Bulk_Crud_Operations.service;

import com.example.BulkDemo.Bulk_Crud_Operations.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    public Student save(Student student);
    public Student update(Student student);
    public Student get(Long id);
    public void delete(Student student);
    public List<Student> saveAll(List<Student> students);
    public List<Student> updateAll(List<Student> students);
    public List<Student> getAll();
    public void deleteAll(List<Student> students);
}
