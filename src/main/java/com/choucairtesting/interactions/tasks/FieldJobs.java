package com.choucairtesting.interactions.tasks;

import com.choucairtesting.interactions.utils.TextInput;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.choucairtesting.interactions.userinterface.ClickFieldJobs.*;
import static com.choucairtesting.interactions.userinterface.Employment.CAMPO_EMPLEO;
import static com.choucairtesting.interactions.userinterface.Employment.VEN_A_PROBAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FieldJobs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_EMPLEO),
                Scroll.to(VEN_A_PROBAR),
                Click.on(PORTAL_EMPLEOS),
                 Click.on(CONTINUAR),
                Click.on(NUESTRAS_VACANTES),
                Enter.theValue(TextInput.OFERTA).into(BUSCAR),
                Click.on(CLICK_BUSCAR)
        );
    }
    public static FieldJobs fieldJobs() {return instrumented(FieldJobs.class);
    }
}
