/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentation;

import com.mycompany.provaesame.Messaggi;
import com.mycompany.provaesame.Utenti;
import com.mycompany.service.MessaggioService;
import java.io.IOException;
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
@WebServlet(urlPatterns = "/add")


public class CreaMessaggioServlet extends HttpServlet {
    
    @Inject
    MessaggioService messaggioservice;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       
        
        Messaggi mex = new Messaggi();
        
        Utenti t = new Utenti();
              
        String str = req.getParameter("user");
        
        String str2 = req.getParameter("contenuto");
        
              
        t.setUser(str);
                      
        mex.setContenuto(str2);
        
        mex.setIdUtente(t);
        
        
        messaggioservice.save(mex);
       
         System.out.println(mex);
              
        
    }
 
    
}
