package gradle.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeMethod
    public void DoThisBeforeTest() {
        System.out.println("DoThisBeforeTest");
    }

    @AfterMethod
    public void DoThisAfterTest() {
        System.out.println("DoThisAfterTest");
    }

    @Test
    public void TestSimple() {
        System.out.println("TestSimple");
    }
}
