package com.vinay.department.controller;


import com.vinay.department.entity.Department;
import com.vinay.department.model.DepartmentRequest;
import com.vinay.department.repository.DepartmentRepository;
import com.vinay.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/department")

public class DepartmentController {

    @Autowired
    private  DepartmentService departmentService;


    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody DepartmentRequest departmentRequest) {
        return departmentService.saveDepartment(departmentRequest);
    }

    @GetMapping("/getDepartmentBYName/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name) {
        return departmentService.getDepartmentByName(name);
    }

    

}
