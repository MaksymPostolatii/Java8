package eight.tasks.functionalinterface;

import static util.Constants.MESSAGE_FROM_OVERRIDE_METHOD;

public class FunctionalInterfaceTask implements FunctionalDefault {
    @Override
    public void print() {
        System.out.println(MESSAGE_FROM_OVERRIDE_METHOD);
    }
}
