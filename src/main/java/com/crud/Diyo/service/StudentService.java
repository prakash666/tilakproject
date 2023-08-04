package com.crud.Diyo.service;


import com.crud.Diyo.entity.StudentEntity;
import com.crud.Diyo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public void dataPost(StudentEntity studentEntity){
         studentRepository.save(studentEntity);
    }

    public List<StudentEntity>getData(StudentEntity studentEntity){
       return studentRepository.findAll();
    }

    public void deleteData(StudentEntity studentEntity){
        studentRepository.delete(studentEntity);
    }

    public void updatedData(StudentEntity studentEntity){
        studentRepository.save(studentEntity);
    }

    public void postData(List<StudentEntity> studentEntities){
        studentRepository.saveAll(studentEntities);
    }


}
