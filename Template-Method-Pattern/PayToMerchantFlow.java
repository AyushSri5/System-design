public class PayToMerchantFlow extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Merchant validate");
    }

    @Override
    public void calculateFees() {
        System.out.println("Merchant calculate");
    }

    @Override
    public void debitAmount() {
        System.out.println("Merchant debit");
    }

    @Override
    public void creditAmount() {
        System.out.println("Merchant credit");
    }
}
