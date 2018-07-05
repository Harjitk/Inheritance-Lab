import models.Administrator;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {


        Manager manager = new Manager("Angela", "JC123456C", 45000, 10000, "Business Support");

        Administrator administrator = new Administrator("Linda", "KC123456C", 25000, Manager manager);
    }
}
