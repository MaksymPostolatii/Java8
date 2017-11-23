package eight;

import eight.tasks.functionalinterface.FunctionalInterfaceTask;

import java.time.temporal.ChronoUnit;

import static eight.tasks.datetime.DateTimeAPITask.printDateTimeResults;
import static eight.tasks.functionalinterface.FunctionalInterfaceTaskUpdated.printResults;
import static eight.tasks.streams.OptionalClassTask.getAnyAlbumByNotoriousBIG;
import static java.lang.String.format;
import static java.lang.System.out;
import static util.Constants.*;

public class Main {

    public static void main(String[] args) {

        //dateTime results
        printDivider(DATE_TIME);
        printDateTimeResults(2, ChronoUnit.HOURS);

        //optionalClass results
        printDivider(OPTIONAL);
        out.println(getAnyAlbumByNotoriousBIG().toString());

        //functionalInterface results
        printDivider(FUNCTIONAL_INTERFACE);
        FunctionalInterfaceTask object = new FunctionalInterfaceTask();
        object.print();
        object.printMessageFromDefaultMethod();

        //updatedFunctionalInterface results
        printDivider(FUNCTIONAL_INTERFACE_UPDATED);
        printResults();
    }

    private static void printDivider(String taskName) {
        out.println(format(DIVIDER, taskName));
    }

}
