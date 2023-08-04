package com.crud.Diyo.controller;


import com.crud.Diyo.entity.StudentEntity;
import com.crud.Diyo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.stream.LongStream;

@RestController
@RequestMapping("/student")
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @PostMapping("/post")
    public String postData(@RequestBody StudentEntity studentEntity){
        studentService.dataPost(studentEntity);
        return "the data has been posted";
    }
    @GetMapping("/get")
   public List<StudentEntity> display(@RequestBody StudentEntity studentEntity){
         return studentService.getData(studentEntity);
   }

   @DeleteMapping("/{id}")
   public String deleteData(@PathVariable("id")StudentEntity id){
        studentService.deleteData(id);
        return "the data has been successfully deleted";
   }


   @PutMapping("/updated/{id}")
   public String updateData(@PathVariable ("id")StudentEntity id){
        studentService.updatedData(id);
        return "the data has been successfully updated";

   }

   @PostMapping("/getAll")

   public String PostData(@RequestBody List<StudentEntity> studentEntity){
       studentService.postData(studentEntity);
       return "the data has been posted properly";
   }
}
