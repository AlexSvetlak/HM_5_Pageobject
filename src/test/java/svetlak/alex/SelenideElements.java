package svetlak.alex;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelenideElements {
    public SelenideElement
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

}
