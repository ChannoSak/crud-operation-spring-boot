package crudoperation.crudoperation.service;

import crudoperation.crudoperation.entity.Department;
import crudoperation.crudoperation.repository.DepartmentRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("QA")
                        .departmentAddress("BBU High Way")
                        .getDepartmentCode("008")
                        .id(1L)
                        .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("QA"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("Get Data based on Valida Department Name")
    public void whenValidDepartmentName_thenDepartmentNameShouldFound(){
        String departmentName = "QA";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }
}