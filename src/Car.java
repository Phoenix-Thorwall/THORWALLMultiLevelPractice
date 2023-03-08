public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isDiscountApplied()
    {
        return discountApplied;
    }

    public boolean isElectric()
    {
        return electric;
    }

    public void printCar()
    {
        String licenseMsg = "Car " + getLicensePlate();
        String tollMsg = " has a toll fee of " + getTollFee();
        String passengerMsg = " and " + getPassengers() + " passenger(s) ";
        String electricMsg = "";
        String discountMsg = "";
        if (electric)
        {
            electricMsg = "This car is electric. HOORAY for the environment. ";
        }
        else
        {
            electricMsg = "This car kills polar bears. ";
        }
        if (discountApplied)
        {
            discountMsg = "Lucky you, you also got a discount!";
        }
        else
        {
            discountMsg = "Unfortunately, you had to pay full price for this :(";
        }
        System.out.println(licenseMsg + tollMsg + passengerMsg + electricMsg + discountMsg);
    }

    public boolean dropOffPassengers(int numOut)
    {
        if (numOut >= getPassengers())
        {
            return false;
        }
        else
        {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }
}