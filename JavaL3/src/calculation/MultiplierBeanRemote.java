/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import javax.ejb.Remote;

/**
 *
 * @author wojte
 */
@Remote
public interface MultiplierBeanRemote {

    int multiply(int arg1, int arg2);
    
}
