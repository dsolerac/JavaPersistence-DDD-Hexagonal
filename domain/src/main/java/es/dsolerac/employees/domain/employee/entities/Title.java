package es.dsolerac.employees.domain.employee.entities;

import java.time.LocalDate;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Title {

    private Employee emp_no;
    private Title title;
    private LocalDate from_date;
    private LocalDate to_date;




    public Employee getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(Employee emp_no) {
        this.emp_no = emp_no;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public LocalDate getFrom_date() {
        return from_date;
    }

    public void setFrom_date(LocalDate from_date) {
        this.from_date = from_date;
    }

    public LocalDate getTo_date() {
        return to_date;
    }

    public void setTo_date(LocalDate to_date) {
        this.to_date = to_date;
    }

}
