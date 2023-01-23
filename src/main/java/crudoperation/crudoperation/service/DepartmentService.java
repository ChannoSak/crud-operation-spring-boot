package crudoperation.crudoperation.service;

import crudoperation.crudoperation.entity.Department;
import crudoperation.crudoperation.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long id);

    public Department updateDepartment(Long id, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
