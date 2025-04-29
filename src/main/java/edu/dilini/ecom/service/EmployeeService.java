package edu.dilini.ecom.service;

import edu.dilini.ecom.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAll();
    void updateEmployee(Employee employee);
    void deleteEmployee(Integer id);
    void updateEmpolyeeById(Integer id, Employee employee);
    Employee searchEmployeeById(Integer id);

}
