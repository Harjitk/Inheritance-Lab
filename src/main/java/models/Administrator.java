package models;

import javax.persistence.*;

public class Administrator extends Employee {

    private int id;
    private Manager manager;

    public Administrator() {
    }

    public Administrator(int id, String name, String NINumber, int salary, Manager manager) {
        super(id, name, NINumber, salary);
        this.manager = manager;
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


    @ManyToOne
    @JoinColumn(name = "administrator_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}



//
//    Create a Administrator class which inherits from the employee class.
//        The administrator should also have a manager.










//
//    Create a Administrator class which inherits from the employee class.
//        The administrator should also have a manager.