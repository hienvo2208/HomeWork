package model;

import java.sql.ResultSet;

public class Waiter extends Employee{
    private double compensate;

    public Waiter(ResultSet resultSet) {
    }

    public Waiter(int id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public double getCompensate() {
        return compensate;
    }

    public void setCompensate(double compensate) {
        this.compensate = compensate;
    }

    @Override
    double calculatorSalary() {
        return this.getBasicSalary()+this.compensate;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "compensate=" + compensate +
                '}';
    }
}
