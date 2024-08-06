package model;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class m_web_tables {
    private String name;
    private String type;
    private String text;
    private String id;
    private String className;
    private String xPath;

    // Constructor privado para inicializar desde JSON
    private m_web_tables(String name, String type, String text, String id, String className, String xPath) {
        this.name = name;
        this.type = type;
        this.text = text;
        this.id = id;
        this.className = className;
        this.xPath = xPath;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public String getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public String getXPath() {
        return xPath;
    }

    // Método estático para cargar desde el archivo JSON
    public static List<m_web_tables> loadFromJson() {
        String fileName = "C:\\Users\\Usuario\\Desktop\\Sobre mi\\BI\\Pruebas_Selenium\\demo\\src\\main\\java\\model\\m_web_tables.json";
        List<m_web_tables> elementList = new ArrayList<>();

        try {
            // Leer el archivo JSON
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject jsonObject = new JSONObject(content);

            // Iterar sobre las claves del objeto JSON
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject elementObject = jsonObject.getJSONObject(key);

                // Crear y añadir una instancia de m_web_tables a la lista
                m_web_tables element = new m_web_tables(
                    key,
                    elementObject.optString("type", null),
                    elementObject.optString("text", null),
                    elementObject.optString("id", null),
                    elementObject.optString("class", null),
                    elementObject.optString("xPath", null)
                );
                elementList.add(element);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return elementList;
    }
}
