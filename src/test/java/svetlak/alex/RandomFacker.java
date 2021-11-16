package svetlak.alex;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomFacker {
    Faker faker = new Faker(new Locale("ru"));
    public String address = faker.address().streetAddress();
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();

}
