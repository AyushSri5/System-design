public class WeightMachineAdaptorImp implements WeightMachineAdaptor{
    WeightMachine weightMachine;

    WeightMachineAdaptorImp(WeightMachine machine){
        weightMachine=machine;
    }

    @Override
    public int getWeightInKg() {
        return (int)(weightMachine.getWeightInPounds()*0.45);
    }
}
