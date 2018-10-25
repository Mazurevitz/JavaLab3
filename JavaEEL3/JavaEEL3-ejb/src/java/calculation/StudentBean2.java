package calculation;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author wojte
 */
@Stateless
public class StudentBean2 implements StudentBean2Remote {
    
    @EJB
    private StudentBeanLocal studentBean1;
    
    @Override
    public Student findTheBest(List<Student> students) {
        Student stud;
        
        System.out.println("R1: " + students);
        stud = studentBean1.findTheBest(students);
        System.out.println("R2: " + students);
        
        return stud;
        
    }
}