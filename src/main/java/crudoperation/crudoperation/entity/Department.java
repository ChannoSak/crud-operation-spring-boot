package crudoperation.crudoperation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Please add department name")
    private String departmentName;
    private String departmentAddress;
    private String getDepartmentCode;

    //Using Lombok


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public String getGetDepartmentCode() {
//        return getDepartmentCode;
//    }
//
//    public void setGetDepartmentCode(String getDepartmentCode) {
//        this.getDepartmentCode = getDepartmentCode;
//    }
//
//    public Department() {
//    }
//    public Department(Long id, String departmentName, String departmentAddress, String getDepartmentCode) {
//        this.id = id;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.getDepartmentCode = getDepartmentCode;
//    }
//    @Override
//    public String toString() {
//        return "Department{" +
//                "id=" + id +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", getDepartmentCode='" + getDepartmentCode + '\'' +
//                '}';
//    }


}
