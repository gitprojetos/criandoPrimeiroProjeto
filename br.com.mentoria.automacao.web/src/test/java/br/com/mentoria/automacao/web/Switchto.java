package br.com.mentoria.automacao.web;

import commons.DSL;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class Switchto extends DSL{
    @Test
    public void actionBySwitchTo(){
        super.acessarSite("https://demo.automationtesting.in/Register.html");
        super.actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
        super.clickByXpath("//a[@style='color: white' and text()='Frames']");
    }
}
