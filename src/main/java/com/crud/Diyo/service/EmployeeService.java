package com.crud.Diyo.service;


import com.crud.Diyo.entity.EmployeeEntity;
import com.crud.Diyo.exception.Myexception;
import com.crud.Diyo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public void postData(EmployeeEntity employeeEntity){
        employeeRepository.save(employeeEntity);
    }

    public void postDataAll(List<EmployeeEntity> employeeEntities){
        employeeRepository.saveAll(employeeEntities);
    }

    public List<EmployeeEntity> getData(){
         return employeeRepository.findAll();
    }

    public EmployeeEntity getDataAll(Long id) throws Myexception{
        Optional<EmployeeEntity> optionalEmployeeEntity = employeeRepository.findById(id);
        if (optionalEmployeeEntity.isPresent()){
            return optionalEmployeeEntity.get();
        } else {
            throw new Myexception("you have exception in the code: ");
        }
    }

    public void putData(EmployeeEntity employeeEntity){
    Optional<EmployeeEntity> employee = employeeRepository.findById(employeeEntity.getId());
    if (employee.isPresent()){
        employeeRepository.save(employeeEntity);
    } else {
        System.out.println("No data found");
    }
    }



}
