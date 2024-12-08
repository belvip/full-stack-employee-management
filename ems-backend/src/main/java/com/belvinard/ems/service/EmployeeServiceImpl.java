package com.belvinard.ems.service;

import com.belvinard.ems.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private List<Employee> employees = new ArrayList<>();
    //private Long nextId = 1L;

    @Override
    public void createEmployee(Employee employee) {
        //employee.setId(nextId++);
        employees.add(employee);

    }
}
