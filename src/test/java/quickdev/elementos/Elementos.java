package quickdev.elementos;

import quickdev.drivers.Drivers;
import org.openqa.selenium.By;

public class Elementos extends Drivers {

    By nomeDoProduto = new By.ByXPath("//*[@id=\"inputNome\"]");
    By precoDoProduto = new By.ByXPath("//*[@id=\"inputPreco\"]");
    By validadeDoProduto = new By.ByXPath("//*[@id=\"inputValidade\"]");
    By adicionarProduto = new By.ByXPath("//*[@id=\"form\"]/button");

    public void preencherFomulario() {

        driver.findElement(nomeDoProduto).sendKeys("Detergente");
        driver.findElement(precoDoProduto).sendKeys("10,00");
        driver.findElement(validadeDoProduto).sendKeys("31122021");
        driver.findElement(adicionarProduto).click();

    }
}
