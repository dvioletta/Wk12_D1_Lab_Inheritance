import org.junit.Before;
import org.junit.Test;
import staff.Manager.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){director = new Director("Tim Allen", "JE894355A", 80000, "CEO IT", 1000000);}

    @Test
    public void directorHasName(){
        assertEquals("Tim Allen", director.getName());
    }

    @Test
    public void directorCanChangeName(){
        director.setName("Sarah White");
        assertEquals("Sarah White", director.getName());
    }

    @Test
    public void directorHasNI_number(){
        assertEquals("JE894355A", director.getNI_number());
    }

    @Test
    public void directorChangeNI_number(){
        director.setNI_number("AD445588C");
        assertEquals("AD445588C", director.getNI_number());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void directorRaiseSalary(){
        assertEquals(80000*0.05, director.raiseSalary(0.05),0.2);
    }

    @Test
    public void directorPayBonus(){
        assertEquals(80000*.1, director.payBonus(0.1), .3);
    }

    @Test
    public void directorcheckBudget(){
        assertEquals(1000000, director.getBudget(),0.2);
    }

    @Test
    public void directorupdateBudget(){
        director.setBudget(2500000);
        assertEquals(2500000, director.getBudget(), 0.2);
    }

    @Test
    public void directorHasDept(){
        assertEquals("CEO IT", director.getDeptname());
    }

    @Test
    public void directorCanChangeDept(){
        director.setDeptname("CEO FinTech");
        assertEquals("CEO FinTech", director.getDeptname());
    }
}
