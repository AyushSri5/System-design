package Coffee;

public class Ingredient {
    private String name;
    private int quantity;
    public Ingredient(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }
    public boolean useIngredient(int amount){
        //Check the requirement for the ingredient and use it

        return true;
    }
    public int getQuantity(){
        return this.quantity;
    }
}
