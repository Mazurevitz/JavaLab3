/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author wojte
 */
@Remote
public interface StudentBean2Remote {
    Student findTheBest(List<Student> students);

}
