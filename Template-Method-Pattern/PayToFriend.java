public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Friend validation");
    }

    @Override
    public void calculateFees() {
        System.out.println("Friend calculate Fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Friend Debit amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("Friend Credit Amount");
    }
}
