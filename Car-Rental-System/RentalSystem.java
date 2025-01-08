import java.util.ArrayList;
import java.util.List;

class CarRentalSystem {
    private String name;
    private List<CarRentalBranch> branches;

    // The CarRentalSystem is a singleton class that ensures it will have only one active instance at a time
    private static CarRentalSystem system = null;

    // Private constructor to prevent instantiation
    private CarRentalSystem() {
        branches = new ArrayList<>();
    }

    public void addNewBranch(CarRentalBranch branch) {
        branches.add(branch);
    }

    // Static method to access the singleton instance of CarRentalSystem
    public static CarRentalSystem getInstance() {
        if (system == null) {
            synchronized (CarRentalSystem.class) {
                if (system == null) {
                    system = new CarRentalSystem();
                }
            }
        }
        return system;
    }
}

