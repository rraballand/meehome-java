package fr.home.socket.client.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Util {

    static Logger logger = Logger.getLogger(Util.class);

    private static final String CLIENT_PROPERTIES_FILE = "fr/home/socket/client/client.properties";

    private static Properties properties = new Properties();

    public static void init() {
        try {
            properties.load(Util.class.getClassLoader().getResourceAsStream(CLIENT_PROPERTIES_FILE));
        } catch (final IOException e) {
            String msg = "Erreur lors du chargement des propriétés '" + CLIENT_PROPERTIES_FILE + "'.";
            logger.error("init :: " + msg);
        }
    }

    public static String getData(PropertiesEnum propertiesEnum) {
        init();
        return properties.getProperty(propertiesEnum.getValue());
    }
}
