public class MusicConcertEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(boolean merchandiseRequired, double merchandiseCost) {
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public boolean getMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getMerchandiseCost() {
        return merchandiseCost;
    }

    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    public double calculateEventCost() {
        double totalCost = 0.0;

        if (merchandiseRequired) {
            totalCost += merchandiseCost;
        }

        return totalCost;
    }

    @Override
    public String toString() {
        return "Music Concert Event Details:\n" +
                "Merchandise Required: " + merchandiseRequired + "\n" +
                "Merchandise Cost: $" + merchandiseCost + "\n" +
                "Total Event Cost: $" + calculateEventCost() + "\n";
    }
}
