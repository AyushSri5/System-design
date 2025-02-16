public class Restaurant {
    private static Restaurant restaurant;

    private Restaurant(){

    }

    public static Restaurant getInstance(){
        if(restaurant == null){
            synchronized (Restaurant.class){
                if (restaurant==null){
                    restaurant= new Restaurant();
                }
            }
        }
        return restaurant;
    }

    public void placeOrder(){
        // Logic for placing the order
    }
    public void updateStatus(){
        // Logic for updating the status
    }

}
