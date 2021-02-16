package co.com.choucair.utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.awt.font.TextAttribute;

public class ChoucairJoinPage {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to Join today").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));


}