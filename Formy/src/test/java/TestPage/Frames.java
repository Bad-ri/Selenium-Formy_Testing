package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Frames extends Base{
    @Test
    public void SwitchTabs(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String result = driver.getWindowHandle();
        System.out.println("-------");
        System.out.println(result);
        System.out.println("-------");
    }
}
