package robottest;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.awt.event.KeyEvent;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


@Path("/robot")
public class Main {
    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        Server jettyServer = new Server(8082);
        jettyServer.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(
                org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);

        jerseyServlet.setInitParameter(
                "jersey.config.server.provider.classnames",
                Main.class.getCanonicalName());

        try {
            jettyServer.start();
            jettyServer.join();
        } finally {
            jettyServer.destroy();
        }

    }

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/keyPress/{keycode}")
    public Response keyPress(@Context ServletContext context,
                             @PathParam("keycode") final int keycode) {
        int k = KeyEvent.VK_K;
        robot.keyPress(keycode);
        return Response.ok("[keyPress] keycode: " + keycode).build();
    }

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/keyRelease/{keycode}")
    public Response keyRelease(@Context ServletContext context,
                             @PathParam("keycode") final int keycode) {
        robot.keyRelease(keycode);
        return Response.ok("[keyRelease] keycode: " + keycode).build();
    }

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/keyType/{keycode}")
    public Response keyType(@Context ServletContext context,
                             @PathParam("keycode") final int keycode) throws InterruptedException {
        Thread.sleep(5000);
        robot.keyPress(keycode);
        robot.keyRelease(keycode);
        return Response.ok("[keyType] keycode: " + keycode).build();
    }

}
