/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import javax.ejb.Stateless;

/**
 *
 * @author wojte
 */
@Stateless
public class AdderBean implements AdderBeanLocal {

    @Override
    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
