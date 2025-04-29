package edu.dilini.ecom.controller;

import edu.dilini.ecom.dto.Employee;
import edu.dilini.ecom.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        service.deleteEmployee(id);
    }
    @PatchMapping("/update")
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);
    }
    @GetMapping("/search/{id}")
    public Employee searchEmployee(@PathVariable Integer id){
        return service.searchEmployeeById(id);
    }
    @PatchMapping("/update-by-id/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        service. updateEmpolyeeById(id, employee);

    }
}
