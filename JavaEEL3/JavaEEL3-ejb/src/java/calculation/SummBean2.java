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
@Stateless(mappedName = "sum2")
public class SummBean2 implements SummBean2Remote {

    private int total = 0;

    @Override
    public int sum(int arg1, int arg2) {
        total += arg1 + arg2;
        return total;
    }
}
