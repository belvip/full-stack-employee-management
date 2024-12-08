package com.belvinard.ems.controller;


import com.belvinard.ems.entity.Employee;
import com.belvinard.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/public/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;



    private List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employees;
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return new ResponseEntity<>("Employee added successfully", HttpStatus.CREATED);

    }


}
