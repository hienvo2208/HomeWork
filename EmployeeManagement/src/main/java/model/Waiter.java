package model;

public class Waiter extends Employee {
    private double compensate;

    public Waiter(long id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    @Override
    public double calculatorSalary() {
        return this.compensate + this.getBasicSalary();
    }
}
