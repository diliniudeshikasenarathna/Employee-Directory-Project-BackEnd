package edu.dilini.ecom.controller;

import edu.dilini.ecom.dto.Employee;
import edu.dilini.ecom.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService service;
    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }
}
