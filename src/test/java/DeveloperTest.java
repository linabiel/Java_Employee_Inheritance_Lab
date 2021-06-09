import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Bob", "GB123456Y", 35000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Joe");
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canSetNiNumber() {
        developer.setNiNumber("DF123456G");
        assertEquals("DF123456G", developer.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000);
        assertEquals(40000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, developer.payBonus(), 0.0);
    }
}
