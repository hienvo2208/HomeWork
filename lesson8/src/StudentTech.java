public class StudentTech {
    private long id;
    private String name;
    private double theorePoint;
    private double practicePotin;

    public StudentTech() {
    }

    public StudentTech(long id, String name, double theorePoint, double practicePotin) {
        this.id = id;
        this.name = name;
        this.theorePoint = theorePoint;
        this.practicePotin = practicePotin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheorePoint() {
        return theorePoint;
    }

    public void setTheorePoint(double theorePoint) {
        this.theorePoint = theorePoint;
    }

    public double getPracticePotin() {
        return practicePotin;
    }

    public void setPracticePotin(double practicePotin) {
        this.practicePotin = practicePotin;
    }

    public double scoreAve() {
        return (getPracticePotin() + getTheorePoint()) / 2;
    }

    @Override
    public String toString() {
        return "StudentTech{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theorePoint=" + theorePoint +
                ", practicePotin=" + practicePotin +
                '}';
    }
}
