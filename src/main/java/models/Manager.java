package models;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {


    private int budget;
    private String department;
    private List<Administrator> administrators;

    public Manager() {
    }

    public Manager(String name, String NINumber, int salary, int budget, String department) {
        super(name, NINumber, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();

    }


    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @OneToMany
    (mappedBy="manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;

    }
}






//
//    Create a Manager class which inherits from the employee class.
//    The manager should also have a budget, a String department and a List of employees.

