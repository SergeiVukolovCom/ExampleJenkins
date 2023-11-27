package testForm;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import testForm.pages.RegistrationPage;
import testForm.steps.EnterDataSteps;
import testForm.utils.JsonHelper;
import testForm.workWithAPI.Requests;
import testForm.workWithAPI.Responses;

@Epic("Registration form")
@Feature("Enter data for registration")
public class Tests extends BaseTest {

    @Test(groups = "web")
    @Story("Test with using check boxes")
    public void testFormWithCheckBoxes() {
        EnterDataSteps.enterDataInForm();
        RegistrationPage.markCheckBoxes();
        Assert.assertTrue(RegistrationPage.submitButtonIsEnabled(), "Submit Button isn't enabled");
    }

    @Test(groups = "web")
    @Story("Test without using check boxes")
    public void testFormWithoutCheckBoxes() {
        EnterDataSteps.enterDataInForm();
        Assert.assertFalse(RegistrationPage.submitButtonIsEnabled(), "Submit Button is enabled");
    }

    @Test(groups = "web")
    @Story("Test without using e-mail")
    public void testFormWithoutEmail() {
        EnterDataSteps.enterDataInFormWithoutEmail();
        Assert.assertFalse(RegistrationPage.submitButtonIsEnabled(), "Submit Button is enabled");
    }

    @Test(groups = "api")
    @Story("Test API requests")
    public void testRequests() {
        Assert.assertEquals(Responses.readStatusCode(Requests.sendGetRequest(JsonHelper.getTestsData().getUrlForRequestSignUp())), JsonHelper.getTestsData().getStatusCodeOK(), "Request is sent incorrectly");
        Assert.assertEquals(Responses.readStatusCode(Requests.sendPostRequest(JsonHelper.getTestsData().getUrlForRequestCallUser())), JsonHelper.getTestsData().getStatusCodeOK(), "Request is sent incorrectly");
        Assert.assertFalse(Responses.checkFieldJson(JsonHelper.extractJson(Responses.getJsonFromResponse(Requests.sendPostRequest(JsonHelper.getTestsData().getUrlForRequestCallUser())))), "You are sent incorrect data to server");
    }

}
