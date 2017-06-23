/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentation;

import com.mycompany.service.FiltroUtente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tss
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    
    
    @Inject
    FiltroUtente filtroUtente;
    
    
    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        
        
        String str = request.getParameter("user");
        
        String str2 = request.getParameter("password");
        
        
        
        
        
    }
    

  

}
