package com.choucairtesting.interactions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.choucairtesting.interactions.userinterface.Employment.*;

public class VerifyInformation implements Question <Boolean>{
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
       validate.assertThat(EMPLEO_CAMPO.resolveFor(actor).getText()).contains("es ser Choucair");
       validate.assertThat(CHOUCAIR.resolveFor(actor).getText()).contains("Prepararse para aplicar");
       validate.assertAll();

        return true;

    }
    public static Question <Boolean> verifyinformation() {
        return new VerifyInformation();
    }
}
