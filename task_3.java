import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean expectedResult;

    // Конструктор для параметризованного теста
    public CheckIsAdultTest(int age, boolean expectedResult) {
        this.age = age;
        this.expectedResult = expectedResult;
    }

    // Метод для предоставления параметров теста
    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][] {
            {19, true},  // возраст больше 18 лет
            {17, false}, // возраст меньше 18 лет
            {18, true},  // возраст ровно 18 лет
            {21, true}   // возраст больше 18 лет
        });
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Ошибка для возраста: " + age, expectedResult, isAdult);
    }
}
