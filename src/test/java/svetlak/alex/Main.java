package svetlak.alex;

import org.junit.jupiter.api.Test;

public class Main extends TestBase {
    private final String URL = "https://demoqa.com/automation-practice-form";
    //Коментарий для домашнего задания по гиту
    @Test
    void newRegistration(){
        registrationPage
                .openPage(URL)
                .fillFirstName(randomFacker.firstName, randomFacker.lastName)
                .fillFamilyName(randomFacker.lastName)
                .setEmail()
                .setMobile()
                .setGender()
                .fillCalendar("13","4","1990")
                .setSubject()
                .setHobbies()
                .uploadPicture()
                .setAdress(randomFacker.address)
                .setState()
                .setCity()
                .clickSubmit();

        checkTests
//                .checkResult("Student Name", randomFacker.firstName + " " + randomFacker.lastName)
//                .checkResult("Student Email", "email@mail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7775166561")
                .checkResult("Date of Birth", "13 May,1990")
//                .checkResult("Subjects", "Computer Science")
//                .checkResult("Hobbies", "Reading")
//                .checkResult("Picture", "t8i0r1.jpg")
                .checkResult("Address", randomFacker.address)
                .checkResult("State and City", "Haryana Panipat");
    }

}
