public class WorkingState implements VendingState{
    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("");
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Product Dispensed");
    }
}
