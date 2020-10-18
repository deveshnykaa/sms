package com.example.BulkDemo.Bulk_Crud_Operations.serviceimpl;

import com.example.BulkDemo.Bulk_Crud_Operations.model.Student;
import com.example.BulkDemo.Bulk_Crud_Operations.repository.StudentRepository;
import com.example.BulkDemo.Bulk_Crud_Operations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student save(Student student){
        Student createResponse = studentRepository.save(student);
        return createResponse;
    }
    @Transactional
    public Student update(Student student){
        Student updateResponse = studentRepository.save(student);
        return updateResponse;
    }
    @Transactional
    public Student get(Long id){
        Optional<Student> studentResponse = studentRepository.findById(id);
        Student getResponse = studentResponse.get();
        return getResponse;
    }
    @Transactional
    public void delete(Student student){
        studentRepository.delete(student);
    }
    @Override
    @Transactional
    public List<Student> saveAll(List<Student> students){
        List<Student> saveResponse = studentRepository.saveAll(students);
        return saveResponse;
    }
    @Override
    @Transactional
    public List<Student> updateAll(List<Student> students){
        List<Student> updateResponse = studentRepository.saveAll(students);
        return updateResponse;
    }
    @Override
    @Transactional
    public List<Student> getAll(){
        //Optional<Student> studentResponse = studentRepository.findById(id);
        List<Student> getResponse = studentRepository.findAll();
        return getResponse;
    }
    @Override
    @Transactional
    public void deleteAll(List<Student> students){
        studentRepository.deleteAll(students);
    }
}
