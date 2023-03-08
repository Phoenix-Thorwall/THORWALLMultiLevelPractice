public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck()
    {
        String licenseMsg = "Truck " + getLicensePlate();
        String tollMsg = " has a toll fee of " + getTollFee();
        String passengerMsg = " and " + getPassengers() + " passenger(s) ";
        String axelMsg = "This truck has " + axles + " axles";
        String trailerMsg = "";
        if (hasTrailer)
        {
            trailerMsg = "This truck has a trailer. ";
        }
        else
        {
            trailerMsg = "This truck doesn't have a trailer. ";
        }

        System.out.println(licenseMsg + tollMsg + passengerMsg + axelMsg + trailerMsg);

    }
}
