package svetlak.alex;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public RegistrationPage registrationPage = new RegistrationPage();
    RandomFacker randomFacker = new RandomFacker();
    CheckTests checkTests = new CheckTests();

    @BeforeAll
    static void config() {
        Configuration.startMaximized = true;
        }
}