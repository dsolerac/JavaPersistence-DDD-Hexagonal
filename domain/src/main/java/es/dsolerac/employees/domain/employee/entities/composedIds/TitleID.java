package es.dsolerac.employees.domain.employee.entities.composedIds;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by dsolerac on 19/12/17.
 */
public class TitleID implements Serializable {

    @PastOrPresent
    private LocalDate fromDate;
    @Size(max = 50) @NotBlank
    private String title;

    public TitleID() {
    }

    public TitleID(LocalDate fromDate, String title) {
        this.fromDate = fromDate;
        this.title = title;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TitleID)) return false;

        TitleID titleID = (TitleID) o;

        if (!getFromDate().equals(titleID.getFromDate())) return false;
        return getTitle().equals(titleID.getTitle());

    }

    @Override
    public int hashCode() {
        int result = getFromDate().hashCode();
        result = 31 * result + getTitle().hashCode();
        return result;
    }
}
