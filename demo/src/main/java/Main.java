import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.t_web_tables;

public class Main {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\Sobre mi\\BI\\Pruebas_Selenium\\demo\\src\\main\\java\\chromedriver\\chromedriver.exe");
        
        
        WebDriver driver = new ChromeDriver();


        
        String url = "https://demoqa.com/webtables"; 
        

        try {
            t_web_tables test = new t_web_tables();
            test.clickSubmitButton(driver, url);
        } finally {
            // Cerrar el navegador
            driver.quit();
        }
    }
}
