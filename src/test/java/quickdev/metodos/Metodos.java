package quickdev.metodos;

import quickdev.drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos extends Drivers {

    public static void acessarOSite() {

        String acessar = "file:///C:/Users/vinic/Downloads/teste-platico-qa/teste-3.html";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(acessar);

    }

    public static void finalizarOAmbiente() {

        driver.quit();
    }

}
