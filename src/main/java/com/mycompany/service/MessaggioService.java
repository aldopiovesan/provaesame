/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.provaesame.Messaggi;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tss
 */

@Stateless
@Named("msg")

public class MessaggioService {
    
    @PersistenceContext
    EntityManager em;
    
    public List<Messaggi>  findAll(){
        
        return em.createNamedQuery("Messaggi.findAll")
                .getResultList();
    }
    
    
    public Messaggi save (Messaggi tosave){
        
        return em.merge(tosave);
    }
    
    
}
