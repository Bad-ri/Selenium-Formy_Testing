package TestPage;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ScreenShot extends Base {
    @Test
    public void TakeScreenShot() throws IOException {
        HomePage home = new HomePage(driver);
        home.OpenHomePage();
        File ScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.move(ScreenShot,new File ("C:\\Users\\Badri\\Documents\\GitHub\\Selenium-Formy_Testing\\Formy\\src\\main\\resources\\ScreenShots\\test.png"));
    }
}
