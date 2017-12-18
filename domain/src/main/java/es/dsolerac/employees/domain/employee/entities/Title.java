package es.dsolerac.employees.domain.employee.entities;

import es.dsolerac.employees.domain.employee.entities.composedIds.TitleID;

import java.time.LocalDate;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Title {

    private Employee employee;

    private TitleID titleID;
//    private String title;
//    private LocalDate fromDate;
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

    //    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public LocalDate getFromDate() {
//        return fromDate;
//    }
//
//    public void setFromDate(LocalDate fromDate) {
//        this.fromDate = fromDate;
//    }

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
