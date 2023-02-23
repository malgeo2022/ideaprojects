public class House {


    private int squareFeet;
    private long previousConsumption;
    private long nowConsumption;
    private long tankLiters;
    private double pricePerUnit;

    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", previousConsumption=" + previousConsumption +
                ", nowConsumption=" + nowConsumption +
                ", tankLiters=" + tankLiters +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }

    public House(int squareFeet, long previousConsumption, long nowConsumption, long tankLiters, double pricePerUnit) {
        this.squareFeet = squareFeet;
        this.previousConsumption = previousConsumption;
        this.nowConsumption = nowConsumption;
        this.tankLiters = tankLiters;
        this.pricePerUnit = pricePerUnit;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public long getPreviousConsumption() {
        return previousConsumption;
    }

    public void setPreviousConsumption(long previousConsumption) {
        this.previousConsumption = previousConsumption;
    }

    public long getNowConsumption() {
        return nowConsumption;
    }

    public void setNowConsumption(long nowConsumption) {
        this.nowConsumption = nowConsumption;
    }

    public long getTankLiters() {
        return tankLiters;
    }

    public void setTankLiters(long tankLiters) {
        this.tankLiters = tankLiters;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
