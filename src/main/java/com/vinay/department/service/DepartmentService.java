package com.vinay.department.service;

import com.vinay.department.entity.Department;
import com.vinay.department.model.DepartmentRequest;
import com.vinay.department.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department saveDepartment(DepartmentRequest departmentRequest) {

        Department department = new Department();
        department.setName(departmentRequest.getName());
        department.setLocation(departmentRequest.getLocation());
        department.setDepartmentNumber(departmentRequest.getDepartmentNumber());
        department.setCountOfEmployees(departmentRequest.getCountOfEmployees());
        return departmentRepository.save(department);
    }

    public Department getDepartmentByName(String name) {
        return departmentRepository.findByName(name);

    }
}
