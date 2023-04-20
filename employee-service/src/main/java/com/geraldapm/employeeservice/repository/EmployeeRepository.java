package com.geraldapm.employeeservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.geraldapm.employeeservice.model.Employee;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee findById(Long id) {
        return employees.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findByDepartmentId(Long departmentId) {
        return employees.stream()
                .filter(emp -> emp.getDepartmentId().equals(departmentId))
                .toList();
    }

    public List<Employee> findAll() {
        return employees;
    }

}
