package com.choucairtesting.interactions.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickFieldJobs {
    public static final Target PORTAL_EMPLEOS =Target.the("Campo Empleo").
            located(By.xpath("//span[@class='elementor-button-text']"));
    public static final Target CONTINUAR =Target.the("Campo Empleo").
            locatedBy("//span[contains(text(),'Continuar')]");
    public static final Target NUESTRAS_VACANTES =Target.the("Campo Empleo").
            locatedBy("//a[contains(text(),'Nuestras Vacantes')]");
    public static final Target BUSCAR =Target.the("Campo Empleo").
            locatedBy("//input[@class='search_query form-control mt-3']");
    public static final Target CLICK_BUSCAR =Target.the("Campo Empleo").
            locatedBy("//input[@class='btn btn-block btn-primary mt-3']");
    public static final Target VERIFY_OFERTA =Target.the("Campo Empleo").
            locatedBy("//h1[@class='font-company-primary']");
}
