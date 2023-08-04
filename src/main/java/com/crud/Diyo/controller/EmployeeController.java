package com.crud.Diyo.controller;


import com.crud.Diyo.entity.EmployeeEntity;
import com.crud.Diyo.entity.StudentEntity;
import com.crud.Diyo.exception.Myexception;
import com.crud.Diyo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController{

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }



    @PostMapping("/post")
    public String postData(@RequestBody EmployeeEntity employeeEntity){
        employeeService.postData(employeeEntity);
        return "the single data has been successfully posted ";

    }

    @PostMapping("/postAll")
    public String postDataAll(@RequestBody List<EmployeeEntity>  employeeEntity){
        employeeService.postDataAll(employeeEntity);
        return "all data has been sucessfully listed";
    }


    @GetMapping("/get")
    public List<EmployeeEntity> getData(){
        return employeeService.getData();
    }


    @GetMapping("/{id}")
    public EmployeeEntity getDataAll(@PathVariable ("id")Long id) throws Myexception {
         return employeeService.getDataAll(id);
    }


    @PutMapping("/put")
public String updateData(@RequestBody EmployeeEntity employeeEntity){
        employeeService.putData(employeeEntity);

        return "the data has been successfully updated";
}



}
