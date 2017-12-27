package es.dsolerac.employees.domain.employee.entities;

import es.dsolerac.employees.domain.employee.entities.composedIds.TitleID;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.time.LocalDate;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Title {

    @NotNull
    private Employee employee;
    private TitleID titleID;

    private LocalDate toDate;



    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TitleID getTitleID() {
        return titleID;
    }

    public void setTitleID(TitleID titleID) {
        this.titleID = titleID;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }


    @Override
    public String toString() {
        return "Title{" +
                "employee=" + employee +
                ", title='" + titleID.getTitle() + '\'' +
                ", fromDate=" + titleID.getFromDate() +
                ", toDate=" + toDate +
                '}';
    }
}
