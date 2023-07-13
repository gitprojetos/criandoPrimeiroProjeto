package commons;

import br.com.mentoria.automacao.configuracao.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DSL extends BaseTest {

    /**
     * Acessar uma UL
     *
     * @param url Inserir url desejada
     */
    public void acessarSite(String url) {
        driver.get(url);
    }

    /**
     * Escever em um elemento desejado
     *
     * @param xpath Insira o elemento xpath
     * @param text  Inserir o texto que deseja escrever
     */

    public void writeByXpath(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    /**
     * Clicar em um elemento desejado
     *
     * @param xpath Inserir um xpath no elemento desejado
     */
    public void clickByXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    /**
     * Clicar em um elemento desejado
     *
     * @param By element para diferentes tipos de locators
     */
    public void click(By element) {
        driver.findElement(element).click();
    }

    public void clickId(String id) {
        driver.findElement(By.id(id)).click();
    }

    /**
     * Selecionar uma opção a aprtirde um select
     *
     * @param id    Isnerir o id do elemento
     * @param value Inserir a value desejada
     */
    public void selectById(String id, String value) {
        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByValue(value);
    }

    /**
     * Scroll com JavascriptExecutor js = (JavascriptExecutor) driver;
     *
     * @param
     */

    public void scrollParaBaixoBuyXpath() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,250);");
    }

    public void scrollParaCimaBuyXpath() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,-250);");
    }

    public void uploudDeArquivoById(String id, String caminhoDoArquivo) {
        WebElement upload = driver.findElement(By.id(id));
        upload.sendKeys(caminhoDoArquivo);
    }

    public void fecharBrowser() {
        driver.quit();
    }

    /**
     * Realiza a interação do cursor até o elemento
     *
     * @param xpath Inserir o xpath do elemento
     */

    public void actionByXpath(String xpath) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(xpath));
        actions.moveToElement(element).build().perform();
    }

    /**
     * Alterar para um iframe
     *
     * @param id Inserir o id do iframe
     */

    public void iframeById(String id) {
        driver.switchTo().frame(id);
    }

    /**
     * Alterar para um multiple frame
     *
     * @param xpath Inserir o id do iframe
     */

    public void iframeByXpath(String xpath) {
        driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
    }

    public void quitFrame(){
        driver.switchTo().defaultContent();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    public void alertCancel(){
        driver.switchTo().alert().dismiss();
    }
    public void alertSendkess(String msg){
        driver.switchTo().alert().sendKeys(msg);
    }
}
 