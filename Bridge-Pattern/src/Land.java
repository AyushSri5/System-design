public class Land extends LivingThings{
    public Land(BreatheImplementor livingThings) {
        super(livingThings);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
