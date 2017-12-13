package es.dsolerac.employees.domain.employee.entities;

import es.dsolerac.employees.domain.employee.entities.composedIds.SalaryID;

import java.time.LocalDate;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Salary {



    //    private SalaryID salaryID;
    private LocalDate fromDate;
    private int salary;
    private LocalDate toDate;
    private Employee employee;


//    public SalaryID getSalaryID() {
//        return salaryID;
//    }

//    public void setSalaryID(SalaryID salaryID) {
//        this.salaryID = salaryID;
//    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
