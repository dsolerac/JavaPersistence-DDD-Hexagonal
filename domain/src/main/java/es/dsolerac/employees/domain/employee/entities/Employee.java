package es.dsolerac.employees.domain.employee.entities;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by dsolerac on 10/11/17.
 */
public class Employee {

    private int idEmployee;

    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate hireDate;

    private List<Salary> salaries;
    private List<Title> titles;

    private List<EmployeeDepartment> employeeDepartments;
    private List<ManagerDepartment> managerDepartments;



    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int emp_no) {
        this.idEmployee = emp_no;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birth_date) {
        this.birthDate = birth_date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hire_date) {
        this.hireDate = hire_date;
    }



    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }



    public List<ManagerDepartment> getManagerDepartments() {
        return managerDepartments;
    }

    public void setManagerDepartments(List<ManagerDepartment> managerDepartments) {
        this.managerDepartments = managerDepartments;
    }

    public List<EmployeeDepartment> getEmployeeDepartments() {
        return employeeDepartments;
    }

    public void setEmployeeDepartments(List<EmployeeDepartment> employeeDepartments) {
        this.employeeDepartments = employeeDepartments;
    }



/*    private List<Department> deparments;
    private List<Department> deparmentsManagers;

    public List<Department> getDeparments() {
        return deparments;
    }

    public void setDeparments(List<Department> deparments) {
        this.deparments = deparments;
    }

    public List<Department> getDeparmentsManagers() {
        return deparmentsManagers;
    }

    public void setDeparmentsManagers(List<Department> deparmentsManagers) {
        this.deparmentsManagers = deparmentsManagers;
    }*/


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + idEmployee +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", hireDate=" + hireDate +
                '}';
    }
}
