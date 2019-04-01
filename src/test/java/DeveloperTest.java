import org.junit.Before;
import org.junit.Test;
import staff.Techstaff.Developer;
import static org.junit.Assert.assertEquals;

public
class DeveloperTest {

Developer developer;

@Before
public void before(){ developer = new Developer ("Anne White", "TE465789D", 35000);}


    @Test
    public void canGetName(){
        assertEquals("Anne White", developer.getName());
    }

    @Test
    public void canChangeName() {
        developer.setName("Anne Tate");
        assertEquals("Anne Tate",developer.getName());
    }

    @Test
    public void canGetNI_number(){
        assertEquals("TE465789D", developer.getNI_number());
    }

    @Test
    public void canChangeNI_number(){
        developer.setNI_number("GE384927A");
        assertEquals("GE384927A", developer.getNI_number());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000, developer.getSalary());
    }

    @Test
    public void canGetARaise(){
    assertEquals(35000*0.02, developer.raiseSalary(0.02), 0.3);
    }

    @Test
    public void canGetBonus(){
    assertEquals(35000*0.01, developer.payBonus(0.01), 0.2);
    }

}
