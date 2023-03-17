package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
    public static WebDriver driver;
    public void OpenBrowser(){
        String driver_path = System.getProperty("user.dir")+"src/main/resources/browser/msedgedriver.exe";
        driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver",driver_path);
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
    }

    public void CloseBrowser(){
        driver.quit();
    }

}
