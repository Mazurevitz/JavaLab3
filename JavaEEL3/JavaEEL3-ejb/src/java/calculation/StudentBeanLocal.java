/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author wojte
 */
@Local
public interface StudentBeanLocal {
    
    Student findTheBest(List<Student> student);
    
}
