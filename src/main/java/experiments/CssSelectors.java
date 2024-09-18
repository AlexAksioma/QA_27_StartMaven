package experiments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {

    @Test
    public void cssSelectors(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        driver.quit();
    }

}
