package es.dsolerac.employees.domain.employee.entities.composedIds;

import es.dsolerac.employees.domain.employee.entities.Department;
import es.dsolerac.employees.domain.employee.entities.Employee;

import java.io.Serializable;

/**
 * Created by dsolerac on 19/12/17.
 */
public class ManagerDepartmentID implements Serializable {

    private Employee employee;
    private Department department;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "ManagerDepartmentID{" +
                "employee=" + employee +
                ", department=" + department +
                '}';
    }
}
