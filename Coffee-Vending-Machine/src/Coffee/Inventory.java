package Coffee;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String,Ingredient> ingredients;

    public Inventory(){
        ingredients=new HashMap<>();
    }
    public boolean checkavailability(String name){
        return ingredients.get(name).getQuantity()>=0;
    }

}
