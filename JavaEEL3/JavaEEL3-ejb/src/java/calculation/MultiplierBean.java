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
    public int multiplier(int arg1, int arg2) {
        try {
            InitialContext ctx = new InitialContext();
            AdderBeanLocal adderBeanLocal = (AdderBeanLocal)
                    ctx.lookup("");
        }
        catch(NamingException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
