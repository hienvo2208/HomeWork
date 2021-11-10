package model;

public class Kitchen extends  Employee{
    private double serviceCharge;

    public Kitchen() {
    }

    public Kitchen(long id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculatorSalary() {
        return this.serviceCharge + this.getBasicSalary();
    }
}
