package it.albertoGiglioli.cap4;

import java.time.ZonedDateTime;

public class Employee {
    private final String name;
    private double salary;
    private ZonedDateTime hireDay;

    public Employee(String name, double salary, ZonedDateTime hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public ZonedDateTime getHireDay() {
        return hireDay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDay(ZonedDateTime hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", hireDay=" + hireDay + '}';
    }

    double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return salary;
    }
}
