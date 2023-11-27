package testForm.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class RegistrationPage {
    private static final SelenideElement inputUserName = Selenide.$("input#userName");
    private static final SelenideElement inputEmail = Selenide.$("input#email");
    private static final SelenideElement inputPhoneNumber = Selenide.$("input#phoneNumber");
    private static final SelenideElement inputPassword = Selenide.$("input#password");
    private static final SelenideElement inputPasswordRepeat = Selenide.$("input#passwordValidation");
    private static final ElementsCollection rulesCheckBoxes = Selenide.$$(".signUpForm__checkoboxItem");
    private static final SelenideElement submitRegButton = Selenide.$("#submitLogin");

    private RegistrationPage() {}

    public static void enterUserName(String userName) {
        inputUserName.setValue(userName);
    }

    public static void enterEmail(String email) {
        inputEmail.setValue(email);
    }

    public static void enterPhoneNumber(Long phoneNumber) {
        inputPhoneNumber.setValue(String.valueOf(phoneNumber));
    }

    public static void enterPassword(String password) {
        inputPassword.setValue(String.valueOf(password));
    }

    public static void enterPasswordRepeat(String password) {
        inputPasswordRepeat.setValue(String.valueOf(password));
    }

    public static void markCheckBoxes() {
        for (SelenideElement checkBox : rulesCheckBoxes) {
            checkBox.click();
        }
    }

    public static boolean submitButtonIsEnabled() {
        return submitRegButton.isEnabled();
    }

}
