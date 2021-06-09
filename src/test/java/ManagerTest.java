import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.managament.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("IT", "Bob", "GB123456Y", 35000.00);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(40000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, manager.payBonus(), 0.0);
    }
}
