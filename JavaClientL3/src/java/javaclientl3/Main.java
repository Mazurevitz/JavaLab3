/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclientl3;

import calculation.CalcBeanRemote;
import calculation.MultiplierBeanRemote;
import calculation.SummBean1Remote;
import calculation.SummBean2Remote;
import calculation.SummBean3Remote;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author wojte
 */
public class Main {

//    @EJB
//        private static CalcBeanRemote calcBean;
//        private static SummBean1Remote summBean1;
//        private static SummBean2Remote summBean2;
//        private static SummBean3Remote summBean3;
    @EJB
        private static MultiplierBeanRemote multiplierBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        
        System.out.println(multiplierBean.multiply(5, 7));
        
//        InitialContext ctx = new InitialContext();
////        calcBean = (CalcBeanRemote)ctx.lookup("calculator");
////        System.out.println("1: " + calcBean.add(2, 3));\
//
//        
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable(){
//            @Override
//                public void run(){
//                    try {
//                        InitialContext ctx = new InitialContext();
//
//                        summBean1 = (SummBean1Remote)ctx.lookup("sum1");
//
//                        System.out.println("sum11: " + summBean1.sum(1, 1));
//                        System.out.println("sum1b: " + summBean1.sum(1, 1));
//
//                        summBean1 = (SummBean1Remote)ctx.lookup("sum1");
//
//                        System.out.println("sum11: " + summBean1.sum(1, 1));
//                        System.out.println("sum1b: " + summBean1.sum(1, 1));
//                    }
//                    catch (NamingException ex) {
//                        System.out.println(ex);
//                    }
//                }
//        }).start();
//
//        }
//    
//        
//        summBean1 = (SummBean1Remote)ctx.lookup("sum1");
////        summBean2 = (SummBean2Remote)ctx.lookup("sum2");
////        summBean3 = (SummBean3Remote)ctx.lookup("sum3");
//
//        System.out.println("sum11: " + summBean1.sum(1, 1));
//        System.out.println("sum1b: " + summBean1.sum(1, 1));
////        System.out.println("sum2a: " + summBean2.sum(2, 2));
////        System.out.println("sum2b: " + summBean2.sum(2, 2));
////        System.out.println("sum3a: " + summBean3.sum(3, 3));
////        System.out.println("sum3b: " + summBean3.sum(3, 3));
//        
//        summBean1 = (SummBean1Remote)ctx.lookup("sum1");
////        summBean2 = (SummBean2Remote)ctx.lookup("sum2");
////        summBean3 = (SummBean3Remote)ctx.lookup("sum3");
//
//        System.out.println("sum11: " + summBean1.sum(1, 1));
//        System.out.println("sum1b: " + summBean1.sum(1, 1));
////        System.out.println("sum2a: " + summBean2.sum(2, 2));
////        System.out.println("sum2b: " + summBean2.sum(2, 2));
//        System.out.println("sum3a: " + summBean3.sum(3, 3));
//        System.out.println("sum3b: " + summBean3.sum(3, 4));
        
        

    }
    
    
}
