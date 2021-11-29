package model;

public class Kitchen extends Employee {
    private double serviceCharge;

    public Kitchen() {
    }

    public Kitchen(int id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    double calculatorSalary() {
        return this.getBasicSalary()+this.serviceCharge;
    }
}
