package AdaptorDesignPattern.Adaptor;

import AdaptorDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

    WeightMachine weightMachine;

   public  WeightMachineAdaptorImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKg() {
      int weightInPound =  weightMachine.getWeightInPound();
      int weightInKg = ((Double)(weightInPound * .45)).intValue();
      return weightInKg;
    }
}
