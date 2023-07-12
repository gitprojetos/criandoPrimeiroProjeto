package br.com.mentoria.automacao.web;

import commons.DSL;
import org.junit.Test;

public class Switchto extends DSL {
    @Test
    public void actionBySwitchTo() {
        acessarSite("https://demo.automationtesting.in/Register.html");
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        fecharBrowser();
    }

    @Test
    public void iframeTest() {
        acessarSite("https://demo.automationtesting.in/Register.html");
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        fecharBrowser();
    }

    @Test
    public void multipleIframe() {
        acessarSite("https://demo.automationtesting.in/Register.html");
        actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        clickByXpath("//a[@style='color: white' and text()='Frames']");
        clickByXpath("//a[@class='analystic' and text()='Iframe with in an Iframe']");
        iframeByXpath("iframe[@src='MultipleFrames.html']");
        fecharBrowser();

    }
}
