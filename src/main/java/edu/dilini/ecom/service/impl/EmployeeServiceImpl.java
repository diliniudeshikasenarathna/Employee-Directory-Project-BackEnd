package edu.dilini.ecom.service.impl;

import edu.dilini.ecom.dto.Employee;
import edu.dilini.ecom.entity.EmployeeEntity;
import edu.dilini.ecom.repository.EmpolyeeRepository;
import edu.dilini.ecom.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    final EmpolyeeRepository repository;
    final ModelMapper mapper;
    @Override
    public void addEmployee(Employee employee) {
        repository.save(mapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAll() {
        List<EmployeeEntity> all=repository.findAll();
        List<Employee> employeeList=new ArrayList<>();
        all.forEach(employeeEntity -> {
            employeeList.add(mapper.map(employeeEntity, Employee.class));
        });
        return employeeList;
    }

    @Override
    public void updateEmployee(Employee employee) {
        repository.save(mapper.map(employee, EmployeeEntity.class));
    }


    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateEmpolyeeById(Integer id, Employee employee) {
        EmployeeEntity existingEmployee = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());

        repository.save(existingEmployee);

    }

    @Override
    public Employee searchEmployeeById(Integer id) {
        return mapper.map(repository.findById(id),Employee.class) ;
    }
}
