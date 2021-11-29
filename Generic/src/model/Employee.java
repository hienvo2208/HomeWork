package model;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private double basicSalary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    abstract double  calculatorSalary();
    @Override
    public String toString() {
        return "model.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                '}';
    }
}
