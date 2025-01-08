public abstract class Account extends Person{
    private String accountId;
    private String password;

    private AccountStatus status;

    private VehicleReservation v;

    public abstract boolean resetPassword();
}

class Receptionist extends Account {
    private Date dateJoined;

    public List<Customer> searchCustomer(String name) {
        // Definition
        return null;
    }

    public boolean addReservation() {
        // Definition
        return true;
    }

    public boolean cancelReservation() {
        // Definition
        return true;
    }

    @Override
    public boolean resetPassword() {
        // Definition
        return true;
    }
}

class Customer extends Account {
    private String licenseNumber;
    private Date licenseExpiry;

    public boolean addReservation() {
        // Definition
        return true;
    }

    public boolean cancelReservation() {
        // Definition
        return true;
    }

    public List<VehicleReservation> getReservations() {
        // Definition
        return null;
    }

    @Override
    public boolean resetPassword() {
        // Definition
        return true;
    }
}
