import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Bob", "GB123456Y", 35000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Joe");
        assertEquals("Joe", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(("GB123"));
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void cantRaiseNegativeSalary(){
        databaseAdmin.raiseSalary(-5000);
        assertEquals(35000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void preventNullInName(){
        databaseAdmin.setName(null);
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, databaseAdmin.payBonus(), 0.0);
    }
}