import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Go {
    @Test
    void successfulSearchTest() {
        //открываем сайт
        open("https://bit-changer.cc/");
        //проверяем, что есть кнопка "Войти" и нажимаем на неё
        $(".primaryButton").shouldBe(visible).click();
        //выбираем "регистрация"
        $("#pills-register-tab").click();
        //заполняем форму
        $("#registerEmail").setValue("vadim.frolov@osinit.com");
        $("#password").setValue("qWERTy123");
        $("#secondPassword").setValue("qWERTy123");
        $x("//*[@class='primaryButton mt-4 py-3 w-100'][1]").shouldBe(visible).click();

        sleep(1000);
    }
}
