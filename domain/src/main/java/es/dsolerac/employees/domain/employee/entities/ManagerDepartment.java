package es.dsolerac.employees.domain.employee.entities;

import es.dsolerac.employees.domain.employee.entities.composedIds.EmployeeDepartmentID;
import es.dsolerac.employees.domain.employee.entities.composedIds.ManagerDepartmentID;

import java.time.LocalDate;

/**
 * Created by dsolerac on 19/12/17.
 */
public class ManagerDepartment {



    private LocalDate fromDate;
    private LocalDate toDate;

    private ManagerDepartmentID managerDepartmentID = new ManagerDepartmentID();



    public ManagerDepartmentID getManagerDepartmentID() {
        return managerDepartmentID;
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

    public void setManagerDepartmentID(ManagerDepartmentID managerDepartmentID) {
        this.managerDepartmentID = managerDepartmentID;
    }


    public Employee getEmployee() {
        return managerDepartmentID.getEmployee();
    }

    public void setEmployee(Employee employee) {
        managerDepartmentID.setEmployee(employee);
    }

    public Department getDeparment() {
        return managerDepartmentID.getDepartment();
    }

    public void setDeparment(Department department) {
        managerDepartmentID.setDepartment(department);
    }


    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", employeeDepartmentID=" + managerDepartmentID +
                '}';
    }
}
