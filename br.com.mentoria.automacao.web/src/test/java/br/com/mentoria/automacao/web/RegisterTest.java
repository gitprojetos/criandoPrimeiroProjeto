package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.configuracao.BaseTest;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class RegisterTest extends BaseTest {

    Faker faker = new Faker(new Locale("pt-BR"));

    @Test
    public void register(){

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().fullAddress();

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tstlinux.c@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8888888888");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("msdd")).click();

        //Scrolando para baixo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,250);");

        driver.findElement(By.xpath("//a[@class='ui-corner-all' and text()='Portuguese']")).click();
        WebElement esq = driver.findElement(By.id("msdd"));
        new Actions(driver).sendKeys(Keys.ENTER);


        //Scrolando para cima
        //js.executeScript("window.scroll(0, -250);");

        Select selectSkills = new Select(driver.findElement(By.id("Skills")));

        selectSkills.selectByValue("SQL");

        //Realizando Upload de arquivo
        WebElement upload =  driver.findElement(By.id("imagesrc"));
        upload.sendKeys("C:\\Users\\user\\Pictures\\imagemjpg.jpg");


        //esppera imnplicita

        //Fecha tudo
        driver.quit();

        //Fecha aquela aba que está com foco, que estamos interagindo
        //Fecha aquela aba espefica
        //driver.close();
    }
}
