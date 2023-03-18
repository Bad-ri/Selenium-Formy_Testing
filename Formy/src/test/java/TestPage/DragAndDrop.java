package TestPage;

import Pages.HomePage;
import org.testng.annotations.Test;

public class DragAndDrop extends Base {
    @Test
    public void ValidDragAndDrop() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.OpenDragAndDrop();
        Thread.sleep(3000);
    }
}
