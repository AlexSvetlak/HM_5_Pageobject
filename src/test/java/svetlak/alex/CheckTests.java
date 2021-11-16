package svetlak.alex;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class CheckTests {
    SelenideElements selenideElements = new SelenideElements();
        public CheckTests checkResult(String label, String value) {
        selenideElements.responsTable
                .$(byText(label))
                .parent()
                .shouldHave(text(value));
        return this;

    }
}

