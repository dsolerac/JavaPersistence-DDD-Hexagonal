package es.dsolerac.employees.domain.employee.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Salary {

    @NotNull
    private Employee employee;

    @PastOrPresent
    private LocalDate fromDate;
    @Positive
    private int salary;
    private LocalDate toDate;


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


    @Override
    public String toString() {
        return "Salary{" +
                "fromDate=" + fromDate +
                ", salary=" + salary +
                ", toDate=" + toDate +
                ", employee=" + employee +
                '}';
    }
}
