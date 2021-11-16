package svetlak.alex;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    SelenideElements selenideElements = new SelenideElements();

    public RegistrationPage openPage(String url) {
        open(url);
        return this;
    }

    public RegistrationPage fillFirstName(String name) {
        $(selenideElements.firstName).setValue(name);
        return this;
    }

    public RegistrationPage fillFamilyName(String familyName) {
        $(selenideElements.lastName).setValue(familyName);
        return this;
    }
    public RegistrationPage setEmail() {
        $(selenideElements.emailInput).setValue("email@mail.com");
        return this;
    }

    public RegistrationPage setMobile() {
        $(selenideElements.userNumber).setValue("7775166561");
        return this;
    }

    public RegistrationPage setGender() {
        $(selenideElements.gender).click();
        return this;
    }

    public RegistrationPage fillCalendar() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        $(".react-datepicker__day.react-datepicker__day--013").click();
        return this;
    }

    public RegistrationPage setSubject() {
        $(selenideElements.subjectsInput).click();
        $(selenideElements.subjectsInput).sendKeys("Comp");
        $(byText("Computer Science")).click();
        return this;
    }

    public RegistrationPage setHobbies() {
        $(selenideElements.hobbies).click();
        return this;
    }

    public RegistrationPage uploadPicture() {
        $(selenideElements.uploadPicture).uploadFile(new File("src//test//resources//t8i0r1.jpg"));
        return this;
    }

    public RegistrationPage setAdress(String adress) {
        $(selenideElements.currentAddress).setValue(adress);
        return this;
    }

    public RegistrationPage setState() {
        $(selenideElements.state).click();
        $(byText("Haryana")).click();
        return this;
    }

    public RegistrationPage setCity() {
        $(selenideElements.city).click();
        $(byText("Panipat")).click();
        return this;
    }

    public RegistrationPage clickSubmit() {
        $(selenideElements.submitClick).click();
        return this;
    }

    public RegistrationPage checkResult(String label, String value) {
        selenideElements.responsTable
                .$(byText(label))
                .parent()
                .shouldHave(text(value));
        return this;
    }

}


