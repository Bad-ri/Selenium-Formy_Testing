package TestPage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
public class JavaExcuter extends Base {
    @Test
    public void Scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        //scroll down
        js.executeScript("scroll(0,250);");
        //scroll up
        js.executeScript("scroll(0,-250);");
    }
}
