/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclientl3;

import calculation.CalcBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author wojte
 */
public class Main {

    @EJB
    private static CalcBeanRemote calcBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1: " + calcBean.add(2, 3));

    }
    
}
