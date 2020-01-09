
package com.Batch6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "Batch6Servlet", urlPatterns = {"/Batch6Servlet"})
public class Batch6Servlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest rq, HttpServletResponse rp)throws ServletException, IOException{
        String name = rq.getParameter("user");
        PrintWriter pw = rp.getWriter();
        String ip = rq.getRemoteAddr();
        System.out.println("Welcome: "+name+": IP: "+ip);
        
        Enumeration<String> headerNames = rq.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String header = headerNames.nextElement();
            String headerValue = rq.getHeader(header);
            
            System.out.println(header+" : "+headerValue);
        }
        System.out.println("================================================");
    }
    

}
