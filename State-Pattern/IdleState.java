public class IdleState implements VendingState{
    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("Coin inserted");
        product.setVendingState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {

    }
}
