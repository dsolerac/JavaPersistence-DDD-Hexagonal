package es.dsolerac.employees.domain.employee.entities;

import es.dsolerac.employees.domain.employee.entities.composedIds.EmployeeDepartmentID;

import java.time.LocalDate;

/**
 * Created by dsolerac on 19/12/17.
 */
public class EmployeeDepartment {



    private LocalDate fromDate;
    private LocalDate toDate;

    private EmployeeDepartmentID employeeDepartmentID = new EmployeeDepartmentID();



    public EmployeeDepartmentID getEmployeeDepartmentID() {
        return employeeDepartmentID;
    }



    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }


    //###########################################################################################################
    //Para poder hacer funcionar la realción de muchos a mucho paso a paso es neceario darle acceso a los valores
    //de la clave primaria que se encuentran en la clase EmployeeDepartmentID.
    //###########################################################################################################

    public void setEmployeeDepartmentID(EmployeeDepartmentID employeeDepartmentID) {
        this.employeeDepartmentID = employeeDepartmentID;
    }


    public Employee getEmployee() {
        return employeeDepartmentID.getEmployee();
    }

    public void setEmployee(Employee employee) {
        employeeDepartmentID.setEmployee(employee);
    }

    public Department getDeparment() {
        return employeeDepartmentID.getDepartment();
    }

    public void setDeparment(Department department) {
        employeeDepartmentID.setDepartment(department);
    }


    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", employeeDepartmentID=" + employeeDepartmentID +
                '}';
    }
}
