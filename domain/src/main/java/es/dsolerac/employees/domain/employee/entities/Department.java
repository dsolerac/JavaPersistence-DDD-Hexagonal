package es.dsolerac.employees.domain.employee.entities;

import javax.validation.constraints.*;
import java.util.List;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Department {

//    @Max(4)
    @Size(max = 4) @NotNull() //@Digits(integer = 55_000, fraction = 0)
    private String idDepartment;

    @NotNull() @NotEmpty @Size(max = 40)
    private String name;

    private List<EmployeeDepartment> employeeDepartments;
    private List<ManagerDepartment> managerDepartments;



    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String dept_name) {
        this.name = dept_name;
    }


    public List<EmployeeDepartment> getEmployeeDepartments() {
        return employeeDepartments;
    }

    public void setEmployeeDepartments(List<EmployeeDepartment> employeeDepartments) {
        this.employeeDepartments = employeeDepartments;
    }

    public List<ManagerDepartment> getManagerDepartments() {
        return managerDepartments;
    }

    public void setManagerDepartments(List<ManagerDepartment> managerDepartments) {
        this.managerDepartments = managerDepartments;
    }

    @Override
    public String toString() {
        return "Department{" +
                "idDepartment='" + idDepartment + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
