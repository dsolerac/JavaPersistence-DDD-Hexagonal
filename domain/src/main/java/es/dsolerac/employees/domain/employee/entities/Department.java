package es.dsolerac.employees.domain.employee.entities;

import java.util.List;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Department {

    private String idDepartment;
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
