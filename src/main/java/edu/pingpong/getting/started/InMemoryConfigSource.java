package edu.pingpong.getting.started;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class InMemoryConfigSource implements ConfigSource {

    private Map<String, String> prop = new HashMap<>();

    /* En el constructor inicializo la propiedad greetings.message */
    public InMemoryConfigSource() {
        this.prop.put("greetings.message", "Memory Hello");
    }

    /* Aumentar la prioridad, gana a application.properties */
    @Override
    public int getOrdinal() {
        return 900;
    }

    @Override
    public String getName() {
        return "InMemoryConfigSource";
    }

    @Override
    public Map<String, String> getProperties() {
        return prop;
    }

    @Override
    public String getValue(String propertyName) {
        return prop.get(propertyName);
    }

}
