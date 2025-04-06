package AdaptorDesignPattern;

import AdaptorDesignPattern.Adaptee.WeightMachineImpl;
import AdaptorDesignPattern.Adaptor.WeightMachineAdaptor;
import AdaptorDesignPattern.Adaptor.WeightMachineAdaptorImpl;

/**
 * In this example, we are using Adaptor Design Pattern.
 * Adaptor Pattern is a structural design pattern which allows the interface of an
 * existing class to be used as another interface.
 * It is often used to make existing classes work with others without modifying their source code.
 *
 * Here, we have {@link WeightMachineImpl} as adaptee which does not provide the expected interface.
 * So we are using {@link WeightMachineAdaptor} as a interface and {@link WeightMachineAdaptorImpl} as
 * adapter class which will adapt the adaptee to the target interface.
 *
 * In this case, Adaptor class is allowing the Adaptee class to work with the target
 * interface without any changes in the Adaptee code.
 */
public class AdaptorMain {

    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());

        System.out.println(weightMachineAdaptor.getWeightInKg());

    }
}
