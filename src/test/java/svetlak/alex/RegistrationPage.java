package svetlak.alex;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    public SelenideElement //комит для проверки ssh ключа
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            emailInput = $("#userEmail"),
            gender = $(byText("Male")),
            userNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            english = $(byText("English")),
            hobbies = $(byText("Reading")),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submitClick = $("#submit"),
            responsTable = $(".table-responsive");

    public RegistrationPage openPage(String url) {
        open(url);
        return this;
    }

    public RegistrationPage fillFirstName(String name, String familyName) {
        firstName.setValue(name);
        lastName.setValue(familyName);
        return this;
    }

    public RegistrationPage fillFamilyName(String familyName) {
        $(lastName).setValue(familyName);
        return this;
    }
    public RegistrationPage setEmail() {
        $(emailInput).setValue("email@mail.com");
        return this;
    }

    public RegistrationPage setMobile() {
        $(userNumber).setValue("7775166561");
        return this;
    }

    public RegistrationPage setGender() {
        $(gender).click();
        return this;
    }

    public RegistrationPage fillCalendar(String day, String month, String year ) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue(month);
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__day-select").selectOptionByValue(day);
        return this;
    }

    public RegistrationPage setSubject() {
        $(subjectsInput).click();
        $(subjectsInput).sendKeys("Comp");
        $(byText("Computer Science")).click();
        return this;
    }

    public RegistrationPage setHobbies() {
        $(hobbies).click();
        return this;
    }

    public RegistrationPage uploadPicture() {
        $(uploadPicture).uploadFile(new File("src//test//resources//t8i0r1.jpg"));
        return this;
    }

    public RegistrationPage setAdress(String adress) {
        $(currentAddress).setValue(adress);
        return this;
    }

    public RegistrationPage setState() {
        $(state).click();
        $(byText("Haryana")).click();
        return this;
    }

    public RegistrationPage setCity() {
        $(city).click();
        $(byText("Panipat")).click();
        return this;
    }

    public RegistrationPage clickSubmit() {
        $(submitClick).click();
        return this;
    }

    public RegistrationPage checkResult(String label, String value) {
        responsTable
                .$(byText(label))
                .parent()
                .shouldHave(text(value));
        return this;
    }



}


