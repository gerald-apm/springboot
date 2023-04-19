package com.geraldapm.employeeservice.model;

public class Employee {
    private Long id;
    private Long departmentId;
    private String name;
    private int age;
    private String position;

    public Employee() {
    }

    public int getAge() {
        return age;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
