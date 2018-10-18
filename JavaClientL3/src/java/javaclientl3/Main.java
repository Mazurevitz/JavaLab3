/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclientl3;

import calculation.CalcBeanRemote;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author wojte
 */
public class Main {

//    @EJB
    private static CalcBeanRemote calcBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        
        InitialContext ctx = new InitialContext();
        calcBean = (CalcBeanRemote)ctx.lookup("calculator");
        System.out.println("1: " + calcBean.add(2, 3));
    }
    
}
