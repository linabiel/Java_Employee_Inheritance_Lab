import org.junit.Before;
import org.junit.Test;
import staff.managament.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("IT","Bob", "GB123456Y", 35000.00, 100000.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(40000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(700, director.payBonus(), 0.0);
    }


}
