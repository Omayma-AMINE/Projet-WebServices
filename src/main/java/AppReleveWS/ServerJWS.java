package AppReleveWS;

import jakarta.xml.ws.Endpoint;
import AppReleve.Releve;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new ReleveWS());
        System.out.println("Web service déployé ");

    }
}
