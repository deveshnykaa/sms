package com.example.BulkDemo.Bulk_Crud_Operations.repository;

import com.example.BulkDemo.Bulk_Crud_Operations.model.Student;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
