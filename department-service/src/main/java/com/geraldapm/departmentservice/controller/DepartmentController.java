package com.geraldapm.departmentservice.controller;

import java.util.List;

import org.apache.hc.core5.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geraldapm.departmentservice.dto.BaseResponse;
import com.geraldapm.departmentservice.model.Department;
import com.geraldapm.departmentservice.repository.DepartmentRepository;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public ResponseEntity<BaseResponse<Department>> add(@RequestBody Department department) {
        Department departmentResponse = departmentRepository.addDepartment(department);
        LOGGER.info("Department add: {}", department);
        return ResponseEntity.ok(new BaseResponse<>(departmentResponse));
    }

    @GetMapping
    public ResponseEntity<BaseResponse<List<Department>>> findAll() {
        List<Department> departmentResponse = departmentRepository.findAll();
        LOGGER.info("Department find all");
        return ResponseEntity.ok(new BaseResponse<>(departmentResponse));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<Department>> findById(@PathVariable Long id) {
        Department departmentResponse = departmentRepository.findById(id);
        LOGGER.info("Department find by id={}", id);
        return ResponseEntity.ok(new BaseResponse<>(departmentResponse));
    }
}
