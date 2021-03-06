package no.cantara.config;

import org.junit.Test;

import java.util.Properties;

import static no.cantara.config.ServiceConfig.getProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ServiceConfigTest {

    @Test
    public void loadProperties() {
        Properties serviceProperties = ServiceConfig.loadProperties();
        assertNotNull(serviceProperties);
        assertEquals(2, serviceProperties.size());
        assertEquals("standard", serviceProperties.getProperty("STANDARD_VALUE"));
        assertEquals("Overridden", serviceProperties.getProperty("OVERRIDDEN"));
    }

    @Test
    public void getPropertyTest() {
        assertEquals("standard", getProperty("STANDARD_VALUE"));
        assertEquals("Overridden", getProperty("OVERRIDDEN"));
    }
}