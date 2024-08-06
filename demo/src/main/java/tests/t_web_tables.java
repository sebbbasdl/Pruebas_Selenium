package tests;

import org.openqa.selenium.WebDriver;
import controller.c_web_tables;

public class t_web_tables {
    public void clickSubmitButton(WebDriver driver, String url) {
        try {
            // Navegar a la página donde está el formulario
            driver.get(url);
            
            Thread.sleep(1000);
            // Maximizar la ventana
            driver.manage().window().maximize();
            System.out.println("Maximizando ventana");
            // Crear una instancia del controlador
            c_web_tables controller = new c_web_tables(driver);
            // Llamar al método para hacer clic en el botón de submit
            controller.S_WebTables();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
