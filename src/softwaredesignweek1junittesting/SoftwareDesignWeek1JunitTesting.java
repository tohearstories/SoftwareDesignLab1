package softwaredesignweek1junittesting;

import org.junit.runner.JUnitCore;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author tug25013
 */
public class SoftwareDesignWeek1JunitTesting {

    public static void main(String[] args) {

        Date date1 = new Date(1979, 3, 26);
        Date date2 = new Date(1979, 3, 22);

        Result result = JUnitCore.runClasses(softwaredesignweek1junittesting.GeorgeJunit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

    }

}
