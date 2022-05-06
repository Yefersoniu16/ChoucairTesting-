package com.choucairtesting.interactions.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Employment {
    public static final Target CAMPO_EMPLEO =Target.the("Campo Empleo").
            located(By.xpath("//a[contains(text(),'Empleos')]"));
    public static final Target QUE_ES_CHOUCAIR =Target.the("Qué es Choucair").
            located(By.xpath("(//img[@class='elementor-animation-grow'])[1]"));
    public static final Target PREPARARSE_PARA_APLICAR =Target.the("Qué es Choucair").
            located(By.xpath("(//img[@class='elementor-animation-grow'])[2]"));
    public static final Target VEN_A_PROBAR =Target.the("Qué es Choucair").
            located(By.xpath("//img[@class='attachment-full size-full']"));
    public static final Target CHOUCAIR =Target.the("Campo Empleo").
            locatedBy("//a[contains(text(),'Prepararse para aplicar')]");
    public static final Target EMPLEO_CAMPO =Target.the("Campo Empleo").
            locatedBy("//a[contains(text(),'es ser Choucair')]");
}

