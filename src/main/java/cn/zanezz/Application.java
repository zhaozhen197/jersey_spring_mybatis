package cn.zanezz;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

/**
 * @author
 */
public class Application extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public Application() {
        // register application resources
        packages("cn.zanezz.resource");
        // register filters
        register(RequestContextFilter.class);

    }
}
