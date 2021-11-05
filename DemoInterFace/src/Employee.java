public class Employee extends Person{

    @Override
    public int age() {
        return 23;
    }

    @Override
    public String name() {
        return "Hanh Than";
    }

    @Override
    public String dress() {
        return "Son Loc, Can Loc, Ha Tinh";
    }

    @Override
    public double salary() {
        return 10000;
    }
}
