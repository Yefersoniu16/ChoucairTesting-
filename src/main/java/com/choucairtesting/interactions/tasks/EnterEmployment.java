package com.choucairtesting.interactions.tasks;

import com.choucairtesting.interactions.interations.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static com.choucairtesting.interactions.userinterface.ClickFieldJobs.CONTINUAR;
import static com.choucairtesting.interactions.userinterface.ClickFieldJobs.PORTAL_EMPLEOS;
import static com.choucairtesting.interactions.userinterface.Employment.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterEmployment implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_EMPLEO),
                Click.on(QUE_ES_CHOUCAIR),
                Wait.theSeconds(5),
                Scroll.to(VEN_A_PROBAR),
                Wait.theSeconds(3),
                Click.on(PREPARARSE_PARA_APLICAR),
                Wait.theSeconds(3),
                Scroll.to(VEN_A_PROBAR)

        );
    }
    public static EnterEmployment enterEmployment () {
        return instrumented(EnterEmployment.class);
    }

}
