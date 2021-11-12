package model;

public class Waiter extends Employee {
    private double compensate;

    public Waiter() {
    }

    public Waiter(long id, String name, int age, double basicSalary, double compensate) {
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
    public double calculatorSalary() {
        return this.compensate + this.getBasicSalary();
    }
}
