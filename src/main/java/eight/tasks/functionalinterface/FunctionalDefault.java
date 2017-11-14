package eight.tasks.functionalinterface;

import static util.Constants.MESSAGE_FROM_DEFAULT_METHOD;

@FunctionalInterface
public interface FunctionalDefault {
    void print();
    default void printMessageFromDefaultMethod() {
        System.out.println(MESSAGE_FROM_DEFAULT_METHOD);
    }
}
