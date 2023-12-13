import org.example.mvn.services.MoneyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class MoneyServiceTest {
    @Test
    public void test() {
        MoneyService service = new MoneyService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test1() {
        MoneyService service = new MoneyService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

}
