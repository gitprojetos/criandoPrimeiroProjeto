package br.com.mentoria.automacao.web;

import commons.DSL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Switchto extends DSL {

    @Before
    public void beforeTest() {
        acessarSite("https://demo.automationtesting.in/Register.html");
    }

    @Test
    public void actionBySwitchTo() {
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
    }

    @Test
    public void iframeTest() {
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
//      clickByXpath("//a[@style='color: white' and text()='Frames']");
    }

    @Test
    public void multipleIframe() {
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
//      clickByXpath("//a[@style='color: white' and text()='Frames']");
//      clickByXpath("//a[@class='analystic' and text()='Iframe with in an Iframe']");
//      iframeByXpath("iframe[@src='MultipleFrames.html']");

    }

    @After
    public void afterTest() {
        fecharBrowser();
    }
}
