import io.netty.channel.epoll.EpollServerChannelConfig;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class RegisterTest {

    @Test
    public void register(){
        //System .setProperty("chromedriver.driver.chrome", "C:\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Etech");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mentoria");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Teste Endereço");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tstlinux.c@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8888888888");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("msdd")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,250);");

        driver.findElement(By.xpath("//a[@class='ui-corner-all' and text()='Portuguese']")).click();
        WebElement esq = driver.findElement(By.id("msdd"));
        new Actions(driver).sendKeys(Keys.ENTER);


        //Scrolando para cima
        //js.executeScript("window.scroll(0, -250);");

        Select selectSkills = new Select(driver.findElement(By.id("Skills")));

        selectSkills.selectByValue("SQL");
    }
}
