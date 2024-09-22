package experiments;

import org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {

    @Test
    public void cssSelectors(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement elementA = driver.findElement(By.xpath("a[href='https://demoqa.com']"));
        System.out.println(elementA.getAttribute("href"));

        driver.quit();
    }

    @Test
    public void cssSelectorsTrello(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://trello.com/");
        driver.manage().window().maximize();

        WebElement elementLogo = driver.findElement(By.cssSelector("a[data-testid='logo_link']"));
        System.out.println(elementLogo.getAttribute("href"));

        WebElement btnLogin = driver.findElement(By.cssSelector("a[data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']"));
        btnLogin.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement inputEmail = driver.findElement(By.cssSelector("*[placeholder='Enter your email']"));
        inputEmail.sendKeys("my_email@mail.com");

        WebElement span = driver.findElement(By.cssSelector("button[id='login-submit']>span"));
        System.out.println(span.getText());

        WebElement btnContinue = driver.findElement(By.xpath("//button[@id='login-submit']")); //xpath
        WebElement btnContinue1 = driver.findElement(By.cssSelector("button[id='login-submit']"));   //css
        System.out.println(btnContinue.isDisplayed());

        WebElement span1 = driver.findElement(By.xpath("//button[@id='login-submit']/span"));

        WebElement elementForm = driver.findElement(By.xpath("//*[text()='Continue']/../.."));
        System.out.println(elementForm.getTagName());


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.quit();
    }

}
