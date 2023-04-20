package com.geraldapm.departmentservice.client;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import com.geraldapm.departmentservice.model.Employee;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employees/departments-raw/{id}")
    public ResponseEntity<List<Employee>> findByDepartmentId(@PathVariable Long id);
}
