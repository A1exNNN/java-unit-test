import org.junit.Test;
import static org.junit.Assert.*;

class Program {
    public boolean checkIsAdult(int age) {
        return age >= 18;
    }
}

public class ProgramTest {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Пользователь старше 18 лет должен считаться взрослым", true, isAdult);
    }
}
