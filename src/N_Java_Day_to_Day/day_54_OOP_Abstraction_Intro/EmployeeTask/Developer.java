package N_Java_Day_to_Day.day_54_OOP_Abstraction_Intro.EmployeeTask;

import N_Java_Day_to_Day.day_54_OOP_Abstraction_Intro.E;

import java.time.LocalDate;

public final class Developer extends Employee {

    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }
}
