package gradle.test;

import io.cucumber.java.en.Given;

public class Steps {

    @Given("success step @caseId={int}")
    public void success(int caseId) {
        System.out.println("gradle.test.Steps success caseId = " + caseId);
    }
}
