package com.belvinard.ems.controller;


import com.belvinard.ems.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/public/employees")
public class EmployeeController {



    private List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employees;
    }

    /*@PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    } */


}
