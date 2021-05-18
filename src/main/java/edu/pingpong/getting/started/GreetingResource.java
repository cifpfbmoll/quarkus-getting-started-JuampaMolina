package edu.pingpong.getting.started;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

@Path("/hello")
public class GreetingResource {

    /* Inyecto el servicio singleton */
    @Inject
    GreetingsService service;

    Logger logger = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(@Valid Beer beer) {
        System.out.println(beer);
        return Response.ok().build();
    }

    /*
     * @GET
     * 
     * @Produces(MediaType.TEXT_PLAIN) public String hello() { return
     * service.toUpperCase(); }
     */

    /*
     * @GET
     * 
     * @Produces(MediaType.APPLICATION_JSON) public Beer getBeer() {
     * logger.debug("Hello from Log"); return new Beer("Alhambra", 300); }
     */

    /*
     * @GET
     * 
     * @Produces(MediaType.APPLICATION_JSON) public WorldClock getBeer() { return
     * ClientBuilder.newClient().target("http://worldclockapi.com").path(
     * "/api/json/cet/now").request() .get(WorldClock.class); }
     */
}