package edu.dilini.ecom.repository;

import edu.dilini.ecom.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpolyeeRepository extends JpaRepository<EmployeeEntity,Integer> {
}
