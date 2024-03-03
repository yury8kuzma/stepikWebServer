package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import service.AccountService;
import service.UtilClass;
import servlets.FirstServlet;
import servlets.SignInServlet;
import servlets.SignUpServlet;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {


        FirstServlet firstServlet = new FirstServlet();
        SignUpServlet signUpServlet = new SignUpServlet();
        SignInServlet signInServlet = new SignInServlet();
        Path path = Path.of(UtilClass.INDEX_PAGE);

        Path abs = path.toAbsolutePath();
        System.out.println(abs);
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.addServlet(new ServletHolder(firstServlet), "/*");
        context.addServlet(new ServletHolder(signUpServlet), "/signup");
        context.addServlet(new ServletHolder(signInServlet), "/signin");
        server.setHandler(context);



        server.start();
        System.out.println("Server started!");
        server.join();






    }

}
