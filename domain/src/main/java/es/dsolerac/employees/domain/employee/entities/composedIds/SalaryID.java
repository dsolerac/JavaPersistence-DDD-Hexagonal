package es.dsolerac.employees.domain.employee.entities.composedIds;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * No hay metodos setter ya que al ser una clave primaria, una vez haya sido construida usando los valores como
 * clave primaria no pueden ser cambiados.
 *
 * Created by dsolerac on 7/12/17.
 */
public class SalaryID implements Serializable {

    private int idEmployee;
    private LocalDate fromDate;


    public SalaryID() {
    }

    public SalaryID(int idEmployee, LocalDate fromDate) {
        this.idEmployee = idEmployee;
        this.fromDate = fromDate;
    }

    public int getIdEmployee() {
        return idEmployee;
    }


    public LocalDate getFromDate() {
        return fromDate;
    }

    private void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    private void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalaryID)) return false;

        SalaryID salaryID = (SalaryID) o;

        if (getIdEmployee() != salaryID.getIdEmployee()) return false;
        return getFromDate().equals(salaryID.getFromDate());

    }

    @Override
    public int hashCode() {
        int result = getIdEmployee();
        result = 31 * result + getFromDate().hashCode();
        return result;
    }


}
