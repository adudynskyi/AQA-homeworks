package gradle.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {
    @DataProvider(name = "default")
    public Object[][] data() {
        return new Object[][] {
                {"Alex", "Dudynskyi"},
                {"Yuriy", "Boiar"},
                {"Roman", "Trotsiuk"}
        };
    }

    @Parameters({"firstname", "lastname"})
    @Test
    public void TestUserName(String firstname, String lastname) {
        System.out.println("Username is " + firstname + " " + lastname);
    }

    @Test(dataProvider = "default")
    public void TestData(String firstname, String lastname) {
        App.data(firstname, lastname);
    }
}
