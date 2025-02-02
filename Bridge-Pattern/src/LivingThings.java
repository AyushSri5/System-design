public abstract class LivingThings {

    BreatheImplementor breatheImplementor;
    public abstract void breathe();

    public LivingThings(BreatheImplementor livingThings){
        breatheImplementor=livingThings;
    }

}
