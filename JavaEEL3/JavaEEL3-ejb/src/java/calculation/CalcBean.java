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
@Stateless(mappedName = "calculator")
public class CalcBean implements CalcBeanRemote {

    @Override
    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }
    
    
}
