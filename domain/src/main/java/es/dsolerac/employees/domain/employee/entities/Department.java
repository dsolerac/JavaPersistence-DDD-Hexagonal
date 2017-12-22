package es.dsolerac.employees.domain.employee.entities;

import java.util.List;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Department {

    private String idDepartment;
    private String name;

    private List<EmployeeDepartment> employeeDepartments;
    private List<EmployeeDepartment> managerDepartments;



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


    /*private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }*/


    public List<EmployeeDepartment> getEmployeeDepartments() {
        return employeeDepartments;
    }

    public void setEmployeeDepartments(List<EmployeeDepartment> employeeDepartments) {
        this.employeeDepartments = employeeDepartments;
    }

    public List<EmployeeDepartment> getManagerDepartments() {
        return managerDepartments;
    }

    public void setManagerDepartments(List<EmployeeDepartment> managerDepartments) {
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
