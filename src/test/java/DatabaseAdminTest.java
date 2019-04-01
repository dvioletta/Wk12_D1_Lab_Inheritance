import org.junit.Before;
import org.junit.Test;
import staff.Techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public
class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() { databaseAdmin = new DatabaseAdmin("Thom Finn", "PH234590F", 25000);}

    @Test
    public void canGetName(){
        assertEquals("Thom Finn", databaseAdmin.getName());
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Sarah Ray");
        assertEquals("Sarah Ray",databaseAdmin.getName());
    }

    @Test
    public void canGetNI_number(){
        assertEquals("PH234590F", databaseAdmin.getNI_number());
    }

    @Test
    public void canChangeNI_number(){
        databaseAdmin.setNI_number("TR677344S");
        assertEquals("TR677344S", databaseAdmin.getNI_number());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, databaseAdmin.getSalary());
    }

    @Test
    public void canGetARaise(){
        assertEquals(25000*0.02, databaseAdmin.raiseSalary(0.02), 0.3);
    }

    @Test
    public void canGetBonus(){
        assertEquals(25000*0.01, databaseAdmin.payBonus(0.01), 0.2);
    }


}
