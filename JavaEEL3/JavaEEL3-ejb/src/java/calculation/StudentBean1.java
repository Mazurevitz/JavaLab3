package calculation;

import java.util.List;
import javax.ejb.Stateless;

/**
 * @author wojte
 */
@Stateless
public class StudentBean1 implements StudentBeanLocal {

    @Override
    public Student findTheBest(List<Student> students){
        Student best = null;
        double avg = Double.MIN_VALUE;
        
        for (Student stud: students) {
            if (stud.getAverage() > avg) {
                avg = stud.getAverage();
                best = stud;
            }
        }
        if (best!=null){
            best.setName(best.getName() + " I'm the best");
        }
        return best;
    }
    
}
