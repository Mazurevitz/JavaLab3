/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import javax.ejb.Local;

/**
 *
 * @author wojte
 */
@Local
public interface AdderBeanLocal {

     int add(int arg1, int arg2);
    
}
