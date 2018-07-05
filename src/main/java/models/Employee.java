package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {

    private int id;
    private String name;
    private String NINumber;
    private int Salary;

    public Employee() {
    }

    public Employee(String name, String NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        Salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "NINumber")
    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }


    @Column(name = "salary")
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}



//
//
//    Create an abstract Employee class. The employee should have a name, a NI number and a salary.
