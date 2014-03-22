package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Vishwajeet
 */
public class UserController extends HttpServlet 
{
    public static boolean checkIfLoggedIn(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        HttpSession session = request.getSession(true);
        if(session.getAttribute("loggedIn") == "true")
        {
            return true;
        }
        else
        {
            response.setContentType("text/html;charset=UTF-8");
            session.setAttribute("errorMessage", "Please Log In");
            request.getRequestDispatcher("index.jsp").include(request, response);
            return false;
        }
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        models.User user = new models.User(username, password);
        
        
        try {
            HttpSession session = request.getSession(true);
            
            if(user.validateUser())
            {
                session.setAttribute("loggedIn",  "true");
                session.setAttribute("username", username);
                RequestDispatcher rs = request.getRequestDispatcher("Welcome");
                rs.forward(request, response);
            }
            else
            {
                response.setContentType("text/html;charset=UTF-8");
                session.setAttribute("errorMessage", "Please input correct Username or Password");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    /**
     * Returns a short description of the servlet.
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
