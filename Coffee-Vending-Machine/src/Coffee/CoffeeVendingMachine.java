package Coffee;

public class CoffeeVendingMachine {
    Inventory inventory;
    PaymentProcessor payment;

    public CoffeeVendingMachine(){
        inventory=new Inventory();
        payment=new PaymentProcessor();
    }
    public Coffee makeCoffee(Coffee coffeeType){
        //Business logic to make Coffee
//        Check inventory
//        Payment Process
        return coffeeType;
    }
}
