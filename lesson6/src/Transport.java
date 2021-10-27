public class Transport {
    private long id;
    private String nameTrans;
    private double speedMax;

    public Transport() {
    }

    public Transport(long id, String nameTrans, double speedMax) {
        this.id = id;
        this.nameTrans = nameTrans;
        this.speedMax = speedMax;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameTrans() {
        return nameTrans;
    }

    public void setNameTrans(String nameTrans) {
        this.nameTrans = nameTrans;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(double speedMax) {
        this.speedMax = speedMax;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", nameTrans='" + nameTrans + '\'' +
                ", speedMax=" + speedMax +
                '}';
    }
}
