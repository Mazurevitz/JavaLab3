/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import javax.ejb.Singleton;

/**
 *
 * @author wojte
 */
@Singleton(mappedName = "sum3")
public class SummBean3 implements SummBean3Remote {

    private int total = 0;

    @Override
    public int sum(int arg1, int arg2) {
        total += arg1 + arg2;
        return total;
    }
}
