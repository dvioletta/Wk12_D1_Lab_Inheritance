import org.junit.Before;
import org.junit.Test;
import staff.Manager.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() { manager = new Manager("Steve Ross", "JE897664A", 50000, "HR"); }

    @Test
    public void managerHasAName(){
        assertEquals("Steve Ross", manager.getName());
    }

    @Test
    public void managerCanChangeName() {
        manager.setName("Bill Williams");
        assertEquals("Bill Williams", manager.getName());
    }

    @Test
    public void managerHasNI_number(){
        assertEquals("JE897664A", manager.getNI_number());
    }

    @Test
    public void managerCanChangeNI_number(){
        manager.setNI_number("AC203050");
        assertEquals("AC203050", manager.getNI_number());
    }

   @Test
    public void managerHasSalary(){
        assertEquals(50000, manager.getSalary());
   }

   @Test
   public void managerRaiseSalary(){
       assertEquals(50000*1.2, manager.raiseSalary(1.2),2);
   }

   @Test
   public void managerPayBonus(){
        assertEquals(50000*0.02, manager.payBonus(0.02),2);
   }

   @Test
    public void managerHasDeptname(){
        assertEquals( "HR", manager.getDeptname());
   }

   @Test
    public void managerCanChangeDeptname(){
        manager.setDeptname("IT");
        assertEquals("IT", manager.getDeptname());
   }


}
