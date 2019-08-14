package testJava;

import com.sun.net.httpserver.HttpServer;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class UserResourceTest {
    private HttpServer server;
    private WebTarget target;
    private String severUri = "http://localhost:8080/restuflApi";

    @Test
    public void setup() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/restuflApi").path("/getString");
        String readEntity = target.request().get(String.class);
        System.out.println(readEntity);
    }

}
