import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }
}
