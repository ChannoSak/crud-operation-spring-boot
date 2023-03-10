package crudoperation.crudoperation.controller;

import crudoperation.crudoperation.entity.Department;
import crudoperation.crudoperation.error.DepartmentNotFoundException;
import crudoperation.crudoperation.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController

public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Create department successfully");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department  fetchDepartmentById(@PathVariable("id") Long id) throws DepartmentNotFoundException {

        return departmentService.fetchDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        departmentService.deleteDepartmentById(id);
        return "Delete department successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long id,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(id,department);
    }

    @GetMapping("/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }


}
