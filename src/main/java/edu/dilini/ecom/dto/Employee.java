package edu.dilini.ecom.dto;

import edu.dilini.ecom.util.DepartmentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private DepartmentType department;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
