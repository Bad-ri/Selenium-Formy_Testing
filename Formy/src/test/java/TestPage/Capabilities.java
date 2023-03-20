package TestPage;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import javax.swing.*;

public class Capabilities {
    @Test
    public void ManageCapabilities(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME,"Edge");
        cap.setCapability("deviceName","badri");
        String BrowserName = cap.getBrowserName();
        String BrowserVersion = cap.getBrowserVersion();
        String DeviceName = (String) cap.getCapability("deviceName");
        System.out.println("-------After--------");
        System.out.println("Browser Name = "+BrowserName);
        System.out.println("Browser Version = "+BrowserVersion);
        System.out.println("Device Name = "+DeviceName);
        System.out.println("----------------------");
    }
}
