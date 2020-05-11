package gradle.testng;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 2)
    public void secondExecuted() {
        System.out.println("I was executed second");
    }

    @Test(priority = 1)
    public void firstExecuted() {
        System.out.println("I was executed first");
    }

    @Test(priority = 3)
    public void thirdExecuted() {
        System.out.println("I was executed third");
    }
}
