/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author wojte
 */
@Stateless
@EJB(name="adder", beanInterface = AdderBeanLocal.class)
public class MultiplierBean implements MultiplierBeanRemote {

    @Override
    public int multiply(int arg1, int arg2) {
        int total = 0;
        try {
            InitialContext ctx = new InitialContext();
            AdderBeanLocal adderBeanLocal = (AdderBeanLocal)
                    ctx.lookup("java:comp/env/adder");
            for (int i = 0; i < arg1; i++) {
                total = adderBeanLocal.add(total, arg2);
            }
        }
        catch(NamingException ex) {
            ex.printStackTrace();
        }
        return total;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
