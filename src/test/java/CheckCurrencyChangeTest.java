import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class CheckCurrencyChangeTest {

    @Test
    public void checkIfGelToAed(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isGelDisplayed());
        homePage.clickGel();
        Assert.assertTrue(homePage.isAedDisplayed());
        homePage.clickAed();
    }

}
