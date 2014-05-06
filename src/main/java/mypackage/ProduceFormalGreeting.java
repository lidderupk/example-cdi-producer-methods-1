/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypackage;

import javax.ws.rs.Produces;

/**
 *
 * @author ulidder
 */
public class ProduceFormalGreeting {
    
    @Produces
    @Formal
    public String GetFormalGreeting(){
        return "Good morning !";
    }
}
