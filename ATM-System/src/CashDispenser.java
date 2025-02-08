public class CashDispenser {
    private int cashAvailable;

    public void dispense_amount(int cash){
        this.cashAvailable=cash;

        // Dispense Logic
    }

    public boolean checkAvailability(int cash){
        return cashAvailable >= cash;
    }
}
