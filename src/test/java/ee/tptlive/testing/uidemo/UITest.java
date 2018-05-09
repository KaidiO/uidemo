package ee.tptlive.testing.uidemo;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UITest {
    @Test
    public void userCanLoginByUsername() {
        // given
        open("http://localhost:8081/personList.jsf");

        // when
        $(By.linkText("John")).click();

        // then
        $("#form").shouldHave(text("Name:\tJohn"));
    }
}
