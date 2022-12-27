package p11properties.p01xml;

import org.springframework.beans.factory.annotation.Value;

import java.util.Properties;

public class InjectProperty {

    private Properties properties;


    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }
}
