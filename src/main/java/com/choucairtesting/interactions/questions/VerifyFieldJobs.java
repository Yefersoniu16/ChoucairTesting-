package com.choucairtesting.interactions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.choucairtesting.interactions.userinterface.ClickFieldJobs.VERIFY_OFERTA;

public class VerifyFieldJobs implements Question <Boolean> {
    private final SoftAssertions validate = new SoftAssertions();
    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
            validate.assertThat(VERIFY_OFERTA.resolveFor(actor).getText()).isEqualTo("Ofertas Laborales");
        return true;
    }
    public static Question <Boolean> verifyfieldjobs() {
        return new VerifyFieldJobs();
    }

}
