package TestPage;

import Pages.HomePage;
import Pages.MousePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Action extends Base{
    HomePage home ;
    MousePage mouse;
    @BeforeClass
    public void Action(){
        home = new HomePage(driver);
        mouse = new MousePage(driver);
    }
    @Test
    public void DoubleClick(){
        driver.get("https://mousetester.com/");
        Assert.assertEquals(mouse.DoubleClick(),2,"Wrong Input");
    }
    @Test
    public void Scroll(){
        home.OpenHomePage();
        home.OpenScrollPage();
        mouse.ScrollDown();
        mouse.ScrollUp();
    }
}
