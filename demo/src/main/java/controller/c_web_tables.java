package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import model.m_web_tables;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.stream.Collectors;

public class c_web_tables {
    private WebDriver driver;
    private Map<String, m_web_tables> modelMap;

    // Constructor
    public c_web_tables(WebDriver driver) {
        this.driver = driver;
        // Convertir la lista a un mapa para acceder a los elementos por su nombre clave
        this.modelMap = m_web_tables.loadFromJson().stream()
                .collect(Collectors.toMap(m_web_tables::getName, element -> element));
    }

    // Método para hacer clic en el botón de submit por nombre clave
    public void S_WebTables() {
        try {
            // Espera fija de 1 segundo
            Thread.sleep(5000);

            // Obtener el elemento específico del mapa
            m_web_tables tituloWebTables = modelMap.get("tituloWebTables");
            if (tituloWebTables != null) {
                // --------- VALIDACIONES ------------
                System.out.println("--------- INI VALIDACIONES ------------");
                // Titulo
                WebElement element_tituloWebTables = driver.findElement(By.xpath(tituloWebTables.getXPath()));
                String label_TituloWebTables = element_tituloWebTables.getText();
                Boolean tituloWebTablesCorrect = tituloWebTables.getText().equals(label_TituloWebTables);
                System.out.println(tituloWebTablesCorrect ? "El titulo es correcto: "+ label_TituloWebTables 
                                                        : "El titulo no es correcto: "+ label_TituloWebTables);
                // Boton Add
                m_web_tables botonAdd = modelMap.get("botonAdd");
                WebElement element_botonAdd = driver.findElement(By.xpath(botonAdd.getXPath()));
                String text_botonAdd = element_botonAdd.getText();
                Boolean botonAddCorrect = botonAdd.getText().equals(text_botonAdd);
                System.out.println( botonAddCorrect ? "El boton Add tiene el texto correcto: " + text_botonAdd 
                                                    : "El boton Add no tiene el texto correcto: " + text_botonAdd);   
                Boolean botonAddEnabled = element_botonAdd.isEnabled();
                assertEquals("El boton Add no esta habilitado", botonAddEnabled, true);
                System.out.println("El boton Add esta habilitado");

                // Input Search
                m_web_tables inputSearch = modelMap.get("inputSearch");
                WebElement element_inputSearch = driver.findElement(By.xpath(inputSearch.getXPath()));
                String text_inputSearch = element_inputSearch.getAttribute("placeholder");
                Boolean inputSearchCorrect = inputSearch.getText().equals(text_inputSearch);
                System.out.println( inputSearchCorrect ? "El input Search tiene el placeholder correcto: " + text_inputSearch 
                                                        : "El input Search no tiene el placeholder correcto: " + text_inputSearch);
                Boolean inputSearchEnabled = element_inputSearch.isEnabled();
                assertEquals("El input Search no esta habilitado", inputSearchEnabled, true);
                System.out.println("El input Search esta habilitado");

                // Boton Search
                m_web_tables botonSearch = modelMap.get("botonSearch");
                WebElement element_botonSearch = driver.findElement(By.xpath(botonSearch.getXPath()));
                Boolean existe_boton = element_botonSearch.isDisplayed();
                assertEquals("El boton Search no existe", existe_boton, true);
                System.out.println("El boton Search existe");

                // Table
                m_web_tables table = modelMap.get("table");
                WebElement element_table = driver.findElement(By.xpath(table.getXPath()));
                Boolean existe_table = element_table.isDisplayed();
                assertEquals("La tabla no existe", existe_table, true);
                System.out.println("La tabla existe");
                // Columna First Name
                m_web_tables columnFirstName = modelMap.get("columnFirstName");
                WebElement element_columnFirstName = driver.findElement(By.xpath(columnFirstName.getXPath()));
                String text_columnFirstName = element_columnFirstName.getText();
                Boolean columnFirstNameCorrect = columnFirstName.getText().equals(text_columnFirstName);
                System.out.println( columnFirstNameCorrect ? "La columna First Name tiene el texto correcto: " + text_columnFirstName 
                                                            : "La columna First Name no tiene el texto correcto: " + text_columnFirstName);
                // Columna Last Name
                m_web_tables columnLastName = modelMap.get("columnLastName");
                WebElement element_columnLastName = driver.findElement(By.xpath(columnLastName.getXPath()));
                String text_columnLastName = element_columnLastName.getText();
                Boolean columnLastNameCorrect = columnLastName.getText().equals(text_columnLastName);
                System.out.println( columnLastNameCorrect ? "La columna Last Name tiene el texto correcto: " + text_columnLastName 
                                                            : "La columna Last Name no tiene el texto correcto: " + text_columnLastName);
                // Columna Age
                m_web_tables columnAge = modelMap.get("columnAge");
                WebElement element_columnAge = driver.findElement(By.xpath(columnAge.getXPath()));
                String text_columnAge = element_columnAge.getText();
                Boolean columnAgeCorrect = columnAge.getText().equals(text_columnAge);
                System.out.println( columnAgeCorrect ? "La columna Age tiene el texto correcto: " + text_columnAge 
                                                        : "La columna Age no tiene el texto correcto: " + text_columnAge);
                // Columna Email
                m_web_tables columnEmail = modelMap.get("columnEmail");
                WebElement element_columnEmail = driver.findElement(By.xpath(columnEmail.getXPath()));
                String text_columnEmail = element_columnEmail.getText();
                Boolean columnEmailCorrect = columnEmail.getText().equals(text_columnEmail);
                System.out.println( columnEmailCorrect ? "La columna Email tiene el texto correcto: " + text_columnEmail 
                                                        : "La columna Email no tiene el texto correcto: " + text_columnEmail);
                // Columna Salary
                m_web_tables columnSalary = modelMap.get("columnSalary");
                WebElement element_columnSalary = driver.findElement(By.xpath(columnSalary.getXPath()));
                String text_columnSalary = element_columnSalary.getText();
                Boolean columnSalaryCorrect = columnSalary.getText().equals(text_columnSalary);
                System.out.println( columnSalaryCorrect ? "La columna Salary tiene el texto correcto: " + text_columnSalary 
                                                        : "La columna Salary no tiene el texto correcto: " + text_columnSalary);
                // Columna Department
                m_web_tables columnDepartment = modelMap.get("columnDepartment");
                WebElement element_columnDepartment = driver.findElement(By.xpath(columnDepartment.getXPath()));
                String text_columnDepartment = element_columnDepartment.getText();
                Boolean columnDepartmentCorrect = columnDepartment.getText().equals(text_columnDepartment);
                System.out.println( columnDepartmentCorrect ? "La columna Department tiene el texto correcto: " + text_columnDepartment 
                                                            : "La columna Department no tiene el texto correcto: " + text_columnDepartment);
                // Columna Actions
                m_web_tables columnAction = modelMap.get("columnAction");
                WebElement element_columnAction = driver.findElement(By.xpath(columnAction.getXPath()));
                String text_columnAction = element_columnAction.getText();
                Boolean columnActionCorrect = columnAction.getText().equals(text_columnAction);
                System.out.println( columnActionCorrect ? "La columna Actions tiene el texto correcto: " + text_columnAction 
                                                            : "La columna Actions no tiene el texto correcto: " + text_columnAction);
                System.out.println("--------- FIN VALIDACIONES ------------");
                
                
                Thread.sleep(1000);
            } else {
                System.out.println("No se encontró el elemento con el nombre clave: " + "tituloWebTables");
            }
        } catch (InterruptedException e) {
            System.out.println("Fail: no se encontró algun elemento importante en la página.");
            e.printStackTrace();
        }
    }
}
