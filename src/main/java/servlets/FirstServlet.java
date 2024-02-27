package servlets;



import service.UtilClass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import java.nio.file.Path;

public class FirstServlet extends HttpServlet
    {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            /*String value = req.getParameter("key");*/
            /*if(value != null)*/

            resp.getWriter().println(UtilClass.getPath(UtilClass.INDEX_PAGE));


            resp.setContentType("text/html;charset=utf-8");
            resp.setStatus(HttpServletResponse.SC_OK);
        }


    }
