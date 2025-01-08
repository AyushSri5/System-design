public abstract class Vehicle {
    String vehicleId;
    String licenseNumber;
    int passengerCapacity;
    boolean hasSunroof;
    VehicleStatus status;
    String model;
    int manufacturingYear;
    int mileage;
    vector<VehicleLog> log;
    Date dueDate;
    int price;

    public abstract boolean reserveVehicle();
    public abstract boolean returnVehicle();
    public abstract float getPrice();

    public abstract void getServiceDone();
}

class Car extends Vehicle {

    @Override
    public boolean reserveVehicle() {
        return false;
    }

    @Override
    public boolean returnVehicle() {
        return false;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public void getServiceDone() {

    }
    private CarType carType;
}

class Truck extends Vehicle{
    private TruckType truckType;

    @Override
    public boolean reserveVehicle() {
        return false;
    }

    @Override
    public boolean returnVehicle() {
        return false;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public void getServiceDone() {

    }
}
class MotorCycle extends Vehicle{
    private MotorType motorType;

    @Override
    public boolean reserveVehicle() {
        return false;
    }

    @Override
    public boolean returnVehicle() {
        return false;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public void getServiceDone() {

    }
}


