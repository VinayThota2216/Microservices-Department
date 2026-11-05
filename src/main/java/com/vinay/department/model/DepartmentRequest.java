package com.vinay.department.model;

import lombok.Data;

@Data
public class DepartmentRequest {

    private String name;
    private String location;
    private int countOfEmployees;
    private String departmentNumber;
}
