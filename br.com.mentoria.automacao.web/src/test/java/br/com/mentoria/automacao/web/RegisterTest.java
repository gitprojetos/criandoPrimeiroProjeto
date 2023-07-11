package br.com.mentoria.automacao.web;

import com.github.javafaker.Faker;
import commons.DSL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class RegisterTest extends DSL {

    Faker faker = new Faker(new Locale("pt-BR"));

    @Test
    public void register(){

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().fullAddress();

        super.acessarSite("https://demo.automationtesting.in/Register.html");
        super.writeByXpath("//input[@placeholder='First Name']", firstName);
        super.writeByXpath("//input[@placeholder='Last Name']", lastName);
        super.writeByXpath("//textarea[@ng-model='Adress']", address);
        super.writeByXpath("//input[@type='email']", "tstlinux.c@gmail.com");
        super.writeByXpath("//input[@type='tel']", "81986552255");
        super.clickByXpath("//input[@value='Male']");
        super.clickId("checkbox2");
        super.clickId("msdd");
        super.scrollParaBaixoBuyXpath();
        super.clickByXpath("//a[@class='ui-corner-all' and text()='Portuguese']");
        super.selectById("Skills", "SQL");
        super.uploudDeArquivoById("imagesrc", "C:\\Users\\user\\Pictures\\imagemjpg.jpg");
        super.fecharBrowser();
    }
}
