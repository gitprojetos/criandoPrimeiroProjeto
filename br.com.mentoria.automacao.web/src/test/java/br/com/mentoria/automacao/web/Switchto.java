package br.com.mentoria.automacao.web;

import commons.DSL;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Switchto extends DSL {

    @Before
    public void beforeTest() {
        acessarSite("https://demo.automationtesting.in/Register.html");
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");

    }

    @Test
    public void iframeTest() {
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
//      clickByXpath("//a[@style='color: white' and text()='Frames']");
    }

    @Test
    public void multipleIframe() {
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
//      clickByXpath("//a[@style='color: white' and text()='Frames']");
//      clickByXpath("//a[@class='analystic' and text()='Iframe with in an Iframe']");
//      iframeByXpath("iframe[@src='MultipleFrames.html']");

    }

    @Test
    public void interactionAlertOk() {
        clickByXpath("//a[@style='color: white' and text()='Alerts']");
        iframeById("aswift_2");
        iframeById("ad_iframe");
        clickByXpath("//div[@id='dismiss-button']");
        quitFrame();
        clickByXpath("//button[@class='btn btn-danger']");
        alertAccept();
    }

    @Test
    public void interactionAlertCancel(){
        clickByXpath("//a[@style='color: white' and text()='Alerts']");
        iframeById("aswift_2");
        iframeById("ad_iframe");
        clickByXpath("//div[@id='dismiss-button']");
        quitFrame();
        clickByXpath("//a[@href='#CancelTab']");
        clickByXpath("//button[@class='btn btn-primary']");
        alertCancel();
        super.driver.findElement(By.xpath("//p[@id='demo']")).getAttribute("innerText");
        

    }

    @Test
    public void interactionAlertOkText(){
        clickByXpath("//a[@style='color: white' and text()='Alerts']");
        iframeById("aswift_2");
        iframeById("ad_iframe");
        clickByXpath("//div[@id='dismiss-button']");
        quitFrame();
        clickByXpath("//a[@href='#Textbox']");
        clickByXpath("//button[@class='btn btn-info']");
        alertSendkess("Deus toma a frente da minhha vida");
        alertAccept();
    }


    @After
    public void afterTest() {
        fecharBrowser();
    }
}
