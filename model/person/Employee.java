package model.person;

import java.time.LocalDate;

public interface Employee {
    LocalDate getHireDate();
    String getPosition();
    double getSalary();
    String getDepartment();
    int calculateExperience();
    boolean isFullTime();
}
