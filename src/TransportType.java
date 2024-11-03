public enum TransportType {
    CAR(0.1),
    BUS(0.05),
    TRUCK(0.02);

    private final double oneKmPrice;

    TransportType(double oneKmPrice) {
        this.oneKmPrice = oneKmPrice;
    }
    public double getOneKmPrice() {
        return oneKmPrice;
    }
}

