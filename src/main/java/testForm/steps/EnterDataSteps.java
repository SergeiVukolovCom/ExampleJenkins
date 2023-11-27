package testForm.steps;

import testForm.pages.RegistrationPage;
import testForm.utils.RandomString;

public class EnterDataSteps {
    private static final String RANDSTR = RandomString.getRandomString();

    private EnterDataSteps() {}

    public static void enterDataInForm() {
        RegistrationPage.enterUserName(RANDSTR);
        RegistrationPage.enterEmail(RANDSTR + "@" + RANDSTR + ".ru" );
        RegistrationPage.enterPhoneNumber(RandomString.getRandomLong());
        RegistrationPage.enterPassword(RANDSTR);
        RegistrationPage.enterPasswordRepeat(RANDSTR);
    }

    public static void enterDataInFormWithoutEmail() {
        RegistrationPage.enterUserName(RANDSTR);
        RegistrationPage.enterPhoneNumber(RandomString.getRandomLong());
        RegistrationPage.enterPassword(RANDSTR);
        RegistrationPage.enterPasswordRepeat(RANDSTR);
    }

}
