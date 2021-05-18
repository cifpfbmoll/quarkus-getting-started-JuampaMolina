package edu.pingpong.getting.started;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/* Solo una instancia para toda la aplicación */
@ApplicationScoped
public class GreetingsService {

    @ConfigProperty(name = "greetings.message")
    String msg;

    public String toUpperCase() {
        return msg.toUpperCase();
    }
}
